package com.example.oauthjwt.vo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RequestLogin {
    private String memberEmail;
    private String password;
}
