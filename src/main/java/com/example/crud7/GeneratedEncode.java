package com.example.crud7;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GeneratedEncode {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawData = "123";
        String encodedPassword = encoder.encode(rawData);
        System.out.println(encodedPassword);
    }
}
