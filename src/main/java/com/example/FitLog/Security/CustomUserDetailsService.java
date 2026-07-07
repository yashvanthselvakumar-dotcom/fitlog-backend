package com.example.FitLog.Security;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.FitLog.Entity.SystemAccount;
import com.example.FitLog.Repository.SystemAccountRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private SystemAccountRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        SystemAccount account = repository.findByUsername(username)
                .orElseThrow(() ->
                        new UsernameNotFoundException("User not found"));

        return new User(
                account.getUsername(),
                account.getPassword(),
                Collections.singleton(
                        new SimpleGrantedAuthority("ROLE_" + account.getRole()))
        );
    }
}