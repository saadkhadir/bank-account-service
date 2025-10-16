package org.example.bankaccountservice.service;

import org.example.bankaccountservice.dto.BankAccountRequestDTO;
import org.example.bankaccountservice.dto.BankAccountResponseDTO;
import org.example.bankaccountservice.entities.BankAccount;

public interface AccountService {
     BankAccountResponseDTO addAccount(BankAccountRequestDTO account);

     BankAccountResponseDTO UpdateAccount(String id, BankAccountRequestDTO bankAccountDTO);
}
