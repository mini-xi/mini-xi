package com.example.oauthjwt.dto;

import java.util.Map;

public class KakaoResponse implements OAuth2Response {
    private final Map<String, Object> attribute;

    public KakaoResponse(Map<String, Object> attribute) {

        if (attribute == null) {
            System.out.println("attribute map is null!");
        } else {
            System.out.println("attribute map is not null");
        }

//        this.attribute = (Map<String, Object>) attribute.get("response");
        this.attribute = attribute; // 수정된 코드
    }

    @Override
    public String getProvider() {
        return "kakao";
    }

    @Override
    public String getProviderId() {

        Object id = attribute.get("id");
        return id != null ? id.toString() : null;

//        return attribute.get("id").toString();
    }

    @Override
    public String getEmail() {

//        return attribute.get("email").toString();
        Map<String, Object> kakaoAccount = (Map<String, Object>) attribute.get("kakao_account");
        return kakaoAccount != null ? (String) kakaoAccount.get("email") : null;
    }

    @Override
    public String getName() {

//        Map<String, Object> properties = (Map<String, Object>) attribute.get("properties");
//        return properties.get("nickname").toString();

        Map<String, Object> properties = (Map<String, Object>) attribute.get("properties");
        if (properties != null) {
            Object nickname = properties.get("nickname");
            return nickname != null ? nickname.toString() : null;
        }
        return null;
    }
}
