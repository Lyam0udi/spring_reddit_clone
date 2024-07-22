package com.example.spring_reddit_clone.service;

import com.example.spring_reddit_clone.dto.RegisterRequest;
import com.example.spring_reddit_clone.model.User;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public void signup(RegisterRequest registerRequest){
        User user = new User();
        user.setUsername(registerRequest.getUsername());
        user.setEmail(registerRequest.getPassword());
        user.setEnabled(false);
    }
}
