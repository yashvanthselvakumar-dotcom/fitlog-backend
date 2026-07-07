package com.example.FitLog.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.FitLog.Entity.SystemAccount;
import java.util.Optional;

@Repository
public interface SystemAccountRepository extends JpaRepository<SystemAccount, Long> {
     Optional<SystemAccount> findByUsername(String username);
}