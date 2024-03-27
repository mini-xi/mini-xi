package com.example.oauthjwt.service;

import com.example.oauthjwt.dto.*;
import com.example.oauthjwt.entity.UserEntity;
import com.example.oauthjwt.entity.UserGrade;
import com.example.oauthjwt.repository.UserRepository;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

@Service
public class CustomOAuth2UserService extends DefaultOAuth2UserService {

    private final UserRepository userRepository;

    public CustomOAuth2UserService(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {

        OAuth2User oAuth2User = super.loadUser(userRequest);
        System.out.println(oAuth2User);

        String registrationId = userRequest.getClientRegistration().getRegistrationId();
        OAuth2Response oAuth2Response = null;
        if (registrationId.equals("naver")) {

            oAuth2Response = new NaverResponse(oAuth2User.getAttributes());
        }
        else if (registrationId.equals("google")) {

            oAuth2Response = new GoogleResponse(oAuth2User.getAttributes());
        }
        else if (registrationId.equals("kakao")) {

            oAuth2Response = new KakaoResponse(oAuth2User.getAttributes());
        }
        else {

            return null;
        }
        String loginId = oAuth2Response.getProvider()+" "+oAuth2Response.getProviderId();
        UserEntity existData = userRepository.findByLoginId(loginId);

        if (existData == null) {

            UserEntity userEntity = new UserEntity();
            userEntity.setLoginId(loginId);
            userEntity.setMemberEmail(oAuth2Response.getEmail());
            userEntity.setMemberName(oAuth2Response.getName());
            userEntity.setMemberGrade(UserGrade.ROLL_MEMBER);

            userRepository.save(userEntity);

            UserDTO userDTO = new UserDTO();
            userDTO.setLoginId(loginId);
            userDTO.setName(oAuth2Response.getName());
            userDTO.setRole(userEntity.getMemberGrade());

            return new CustomOAuth2User(userDTO);
        }
        else {

            existData.setMemberEmail(oAuth2Response.getEmail());
            existData.setMemberName(oAuth2Response.getName());

            userRepository.save(existData);

            UserDTO userDTO = new UserDTO();
            userDTO.setLoginId(existData.getLoginId());
            userDTO.setName(oAuth2Response.getName());
            userDTO.setRole(existData.getMemberGrade());

            return new CustomOAuth2User(userDTO);
        }
    }


}
