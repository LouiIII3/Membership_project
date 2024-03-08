package com.example.social.media;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public User registerUser(String id, String password, LocalDate birthdate, String nickname, String profilePictureUrl) {
        User newUser = new User();
        newUser.setUserid(id);
        newUser.setPassword(passwordEncoder.encode(password));
        newUser.setBirthdate(birthdate);
        newUser.setNickname(nickname);
        newUser.setProfilePictureUrl(profilePictureUrl);
        return userRepository.save(newUser);
    }

    public boolean isUseridExists(String userid) {
        return userRepository.existsByUserid(userid);
    }


    public User findUserByUsername(String userid) {
        return userRepository.findByUserid(userid);
    }

    public boolean updatePassword(String userid, String currentPassword, String newPassword) {
        User user = userRepository.findByUserid(userid);
        if (user != null && passwordEncoder.matches(currentPassword, user.getPassword())) {
            user.setPassword(passwordEncoder.encode(newPassword));
            userRepository.save(user);
            return true;
        }
        return false;
    }

    public int getHeartRate(String userid) {
        User user = userRepository.findByUserid(userid);
        if (user != null) {
            return user.getHeartRate();
        }
        return 0; // 사용자가 존재하지 않을 경우 기본값 반환
    }



}
