package org.example.bankaccountservice.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.bankaccountservice.dto.BankAccountRequestDTO;
import org.example.bankaccountservice.dto.BankAccountResponseDTO;
import org.example.bankaccountservice.entities.BankAccount;
import org.example.bankaccountservice.repositories.BankAccountRepository;
import org.example.bankaccountservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;
import java.util.List;

@Controller
public class BankAccountGraphQLController {
    @Autowired
    private  BankAccountRepository bankAccountRepository;
    private AccountService accountService;

    @QueryMapping
    public List<BankAccount> accountsList(){
        return bankAccountRepository.findAll();
    }

    @QueryMapping
    public BankAccount bankAccountById(String id){
        return bankAccountRepository.findById(id)
                .orElseThrow(()->new RuntimeException(String.format("Account %s not found",id)));
    }
    @MutationMapping
    public BankAccountResponseDTO addAccount(@Argument BankAccountRequestDTO bankAccount ){
        return accountService.addAccount(bankAccount);
    }


    @MutationMapping("/bankAccounts/{id}")
    public BankAccountResponseDTO update(@Argument String id, @Argument BankAccountRequestDTO bankAccount) {
        return accountService.addAccount(bankAccount);
    }

}
