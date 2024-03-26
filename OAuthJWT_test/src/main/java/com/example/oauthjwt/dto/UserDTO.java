package com.example.oauthjwt.dto;

import com.example.oauthjwt.entity.UserGrade;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {

    private String role;
    private String name;
    private String loginId;

    public void setRole(UserGrade memberGrade) {
    }
}
