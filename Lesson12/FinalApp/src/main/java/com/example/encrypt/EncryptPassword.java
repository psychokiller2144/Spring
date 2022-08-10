package com.example.encrypt;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncryptPassword {
    public static void main(String[] args) {
        String password_admin = "admin1234";
        String password_user = "user1234";
        
        System.out.println("password: " + password_admin);
        System.out.println("password cifrado:" + encryptPassword(password_admin));
        
        System.out.println("password: " + password_user);
        System.out.println("password cifrado:" + encryptPassword(password_user));

    }
    
    public static String encryptPassword(String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
}
