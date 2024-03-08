package com.example.social.media;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "user1")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String userid; // id

    @Column
    private String password;

    @Column
    private LocalDate birthdate; // 생년월일

    @Column
    private String nickname; // 사용자 이름

    @Column
    private String profilePictureUrl; // 프로필 사진 URL

    @Column
    private Integer heartRate;

    // 사용자의 심박수를 가져오는 메서드
    public int getHeartRate() {
        return heartRate;
    }

    // 사용자의 심박수를 설정하는 메서드

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public User() {
    }
    public User(String userid) {
        this.userid = userid;
    }


}