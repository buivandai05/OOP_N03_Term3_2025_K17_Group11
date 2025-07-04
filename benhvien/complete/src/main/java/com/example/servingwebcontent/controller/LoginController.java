package com.example.servingwebcontent.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class LoginController {

    // POST /api/auth/login
    @PostMapping("/login")
    public ResponseEntity<Map<String, Object>> login(@RequestBody Map<String, String> payload) {
        String username = payload.get("account");
        String password = payload.get("password");

        if ("admin".equals(username) && "123456".equals(password)) {
            // Đăng nhập thành công
            return ResponseEntity.ok(Map.of(
                "success", true,
                "message", "Đăng nhập thành công"
            ));
        } else {
            // Đăng nhập thất bại
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Map.of(
                "success", false,
                "message", "Tài khoản hoặc mật khẩu không đúng"
            ));
        }
    }
}
