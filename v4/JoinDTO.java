package com.example.springjwt.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class JoinDTO {

    private String username;
    private String password;

    //추가
    private String profilePictureUrl;
    private String nickname;
    private int heartRate;
}
