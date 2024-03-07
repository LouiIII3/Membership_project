package com.example.social.media;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.security.SecureRandom;

@Configuration
public class SecurityConfig {

    //@Bean
    //public BCryptPasswordEncoder bCryptPasswordEncoder() {
    //    return new BCryptPasswordEncoder();
    //}

    //솔트 추가 3/6일
   private static final String SALT = "Th1s1sAS@ltV@lu3!";

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder(10, new SecureRandom(SALT.getBytes()));
    }
}

