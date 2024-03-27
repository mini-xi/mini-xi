package com.example.oauthjwt.service;

import com.example.oauthjwt.dto.RegisterDTO;
import com.example.oauthjwt.entity.UserEntity;
import com.example.oauthjwt.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService {

    private final ModelMapper modelMapper;

    private final UserRepository userRepository;

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserServiceImpl(ModelMapper modelMapper, UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String memberEmail) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository.findByMemberEmail(memberEmail);

        if (userEntity == null)
            throw new UsernameNotFoundException(memberEmail + "아이디의 유저는 존재하지 않음");

        return new User(userEntity.getMemberEmail(), userEntity.getPassword(),
                true, true, true, true,
                new ArrayList<>());
    }

    @Transactional
    @Override
    public void registUser(RegisterDTO registerDTO) {
        //        registerDTO.setMemberEmail(UUID.randomUUID().toString());

        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        UserEntity userEntity = modelMapper.map(registerDTO, UserEntity.class);
        // registerDTO -> Member

//        userEntity.setEncryptedPwd("암호화 된 비밀번호");
        userEntity.setPassword(bCryptPasswordEncoder.encode(registerDTO.getPassword()));

//        System.out.println("DB넣기 전 userEntity = " + userEntity);
        userRepository.save(userEntity);
    }

    @Override
    public RegisterDTO getUserDetailsByEmail(String memberEmail) {
        UserEntity userEntity = userRepository.findByMemberEmail(memberEmail);

        if (userEntity == null)
            throw new UsernameNotFoundException(memberEmail + " 아이디의 유저는 존재하지 않음");

        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        RegisterDTO userDTO = modelMapper.map(userEntity, RegisterDTO.class);

        return userDTO;
    }

    public boolean login(String memberEmail, String rawPassword) {
        // 데이터베이스에서 사용자 정보 조회 (예시)
        UserEntity user = userRepository.findByMemberEmail(memberEmail);
        if (user == null) {
            return false;
        }
        // 저장된 비밀번호와 입력된 비밀번호 비교
        boolean isMatch = bCryptPasswordEncoder.matches(rawPassword, user.getPassword());
        return isMatch;
    }
}
