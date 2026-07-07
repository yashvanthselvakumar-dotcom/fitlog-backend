package com.example.FitLog.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.example.FitLog.DTO.AuthRequestDto;
import com.example.FitLog.DTO.AuthResponseDto;
import com.example.FitLog.Entity.SystemAccount;
import com.example.FitLog.Repository.SystemAccountRepository;
import com.example.FitLog.Security.JwtUtil;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private SystemAccountRepository repository;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private PasswordEncoder encoder;

    @PostMapping("/register")
    public SystemAccount register(@RequestBody SystemAccount account) {

        account.setPassword(encoder.encode(account.getPassword()));

        return repository.save(account);
    }

    @PostMapping("/login")
    public AuthResponseDto login(@RequestBody AuthRequestDto dto) {

        SystemAccount account = repository.findByUsername(dto.getUsername())
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (encoder.matches(dto.getPassword(), account.getPassword())) {

            String token = jwtUtil.generateToken(account.getUsername());

            return new AuthResponseDto(token, account.getUsername(), account.getRole().name());
        }

        throw new RuntimeException("Invalid Credentials");
    }
}