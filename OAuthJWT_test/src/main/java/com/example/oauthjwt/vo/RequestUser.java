package com.example.oauthjwt.vo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RequestUser {
    private String memberEmail;
    private String password;
    private String memberName;
    private String memberNickname;
    private String memberNumber;
}
