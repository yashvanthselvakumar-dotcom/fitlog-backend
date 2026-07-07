package com.example.FitLog.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FitLog.Entity.SystemAccount;
import com.example.FitLog.Exception.ResourceNotFoundException;
import com.example.FitLog.Repository.SystemAccountRepository;

@Service
public class SystemAccountService {

    @Autowired
    private SystemAccountRepository repository;

    // Create Account
    public SystemAccount saveAccount(SystemAccount account) {
        return repository.save(account);
    }

    // Get All Accounts
    public List<SystemAccount> getAllAccounts() {
        return repository.findAll();
    }

    // Get Account By Id
    public SystemAccount getAccountById(Long id) {

        return repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException(
                                "Account not found with id: " + id));
    }

    // Update Account
    public SystemAccount updateAccount(Long id,
                                       SystemAccount account) {

        SystemAccount existingAccount = getAccountById(id);

        existingAccount.setUsername(account.getUsername());
        existingAccount.setEmail(account.getEmail());
        existingAccount.setRole(account.getRole());
        existingAccount.setPassword(account.getPassword());

        return repository.save(existingAccount);
    }

    // Delete Account
    public void deleteAccount(Long id) {

        SystemAccount existingAccount = getAccountById(id);

        repository.delete(existingAccount);
    }
}