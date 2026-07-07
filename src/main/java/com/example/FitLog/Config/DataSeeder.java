package com.example.FitLog.Config;
import com.example.FitLog.enums.Role;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.example.FitLog.Entity.SystemAccount;
import com.example.FitLog.Repository.SystemAccountRepository;

@Component
public class DataSeeder implements CommandLineRunner {

    private final SystemAccountRepository repository;
    private final PasswordEncoder encoder;

    public DataSeeder(SystemAccountRepository repository,
                      PasswordEncoder encoder) {
        this.repository = repository;
        this.encoder = encoder;
    }

    @Override
    public void run(String... args) throws Exception {

        if (repository.findByUsername("admin").isEmpty()) {

            SystemAccount admin = new SystemAccount();
            admin.setUsername("admin");
            admin.setEmail("admin@fitlog.com");
            admin.setPassword(encoder.encode("admin123"));
            admin.setRole(Role.ADMIN);
            repository.save(admin);

            System.out.println("Default Admin User Created");
        }
    }
}