package com.example.oauthjwt.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "member_info")
@Getter
@Setter
public class UserEntity {


    @Id
    @Column(name = "member_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberId;

    @Column(name = "member_email")
    private String memberEmail = "";

    @Column(name = "password")
    private String password = "";

    @Column(name = "member_name")
    private String memberName;

    @Column(name = "member_nickname")
    private String memberNickname = "";

    @Column(name = "member_number")
    private String memberNumber = "";

    @Column(name = "join_date")
    private String joinDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());;

    @Column(name = "withdrawal_date")
    private String withdrawalDate = null;

    @Column(name = "member_grade")
    @Enumerated(EnumType.STRING)
    private UserGrade memberGrade = UserGrade.ROLL_MEMBER;

    @Column(name = "member_status")
    private String memberStatus = "Y";

    @Column(name = "loginId")
    private String loginId;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String loginId;
//    private String name;
//
//    private String email;
//
//    private String role;
}
