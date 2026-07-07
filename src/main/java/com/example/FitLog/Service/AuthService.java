package com.example.FitLog.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.FitLog.Entity.SystemAccount;
import com.example.FitLog.Repository.SystemAccountRepository;
import com.example.FitLog.Security.JwtUtil;

@Service
public class AuthService {

    @Autowired
    private SystemAccountRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtil jwtUtil;

    public SystemAccount register(SystemAccount account) {

        account.setPassword(
                passwordEncoder.encode(account.getPassword()));

        return repository.save(account);
    }

    public String login(String username, String password) {

        SystemAccount account = repository.findByUsername(username)
                .orElseThrow(() ->
                        new RuntimeException("User not found"));

        if (passwordEncoder.matches(password,
                account.getPassword())) {

            return jwtUtil.generateToken(username);
        }

        throw new RuntimeException("Invalid Credentials");
    }
}