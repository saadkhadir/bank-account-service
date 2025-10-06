package org.example.bankaccountservice.repositories;

import org.example.bankaccountservice.entities.BankAccount;
import org.springframework.data.repository.CrudRepository;

public interface BankAccoutRepository extends CrudRepository<BankAccount, String> {
}
