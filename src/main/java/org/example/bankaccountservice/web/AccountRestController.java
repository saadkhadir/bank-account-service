package org.example.bankaccountservice.web;

import org.example.bankaccountservice.entities.BankAccount;
import org.example.bankaccountservice.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountRestController {
    @Autowired
    private BankAccountRepository bankAccountRepository;



    @GetMapping("/bankAccounts")
    public List<BankAccount> bankAccounts() {
        return bankAccountRepository.findAll();
    }
    @GetMapping("/bankAccounts/{id}")
    public BankAccount bankAccount(@PathVariable String id) {
        return bankAccountRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("Account %s not found",id)));
    }


}
