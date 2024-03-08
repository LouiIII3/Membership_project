package com.example.social.media;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;



@Configuration
@EnableWebSecurity
public class WebSecurityConfig {


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())
                .authorizeRequests(authorizeRequests ->
                        authorizeRequests
                                //인증된 사용자만 접속 가능
                                //.requestMatchers("/web/music").authenticated()
                                //인증된 사용자든 인증되지 않은 사용자든 모두 접근할 수 있습니다.
                                .requestMatchers("/**").permitAll() // 수정된 부분
                                //나머지 모든 요청에 대해서는 인증된 사용자만이 접근할 수 있도록 설정합니다
                                .anyRequest().authenticated()

                );
        return http.build();
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}


