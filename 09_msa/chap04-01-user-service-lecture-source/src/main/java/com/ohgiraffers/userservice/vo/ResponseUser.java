package com.ohgiraffers.userservice.vo;

import lombok.Data;

import java.util.List;

@Data
public class ResponseUser {
    ;/

    /* 설명. FeignClient 이후(다른 도메인 서버와 통신해서 값을 가져온 이후) 추가할 것 */
    private List<ResponseOrder> orders;
}
