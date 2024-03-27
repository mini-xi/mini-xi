package com.example.oauthjwt.controller;

import com.example.oauthjwt.dto.RegisterDTO;
import com.example.oauthjwt.service.UserService;
import com.example.oauthjwt.vo.RequestUser;
import com.example.oauthjwt.vo.ResponseUser;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class RegistController {

    private final UserService userService;

    private final ModelMapper modelMapper;

    @Autowired
    public RegistController(UserService userService, ModelMapper modelMapper) {
        this.userService = userService;
        this.modelMapper = modelMapper;
    }

    @PostMapping("/register")
    public ResponseEntity<ResponseUser> register (@RequestBody RequestUser user) {


//        memberService.registUser(RegisterDTO registerDTO);

        // 생성된 Member 객체를 Member 테이블에 추가
//        Member newMember = Member.createMember(user);
        RegisterDTO userDTO = modelMapper.map(user, RegisterDTO.class);



        userService.registUser(userDTO);

        ResponseUser responseUser = modelMapper.map(userDTO, ResponseUser.class);

//        return ResponseEntity.status(HttpStatus.CREATED).build();
        return ResponseEntity.status(HttpStatus.CREATED).body(responseUser);

//        memberRepository.save(user);
    }
}
