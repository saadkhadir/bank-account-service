package org.example.bankaccountservice.repositories;

import org.example.bankaccountservice.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
    List<BankAccount> id(String id);
}
