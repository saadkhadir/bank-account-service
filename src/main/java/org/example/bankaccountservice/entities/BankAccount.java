package org.example.bankaccountservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.bankaccountservice.enums.AccoutType;

import java.util.Date;
@Entity @Data
@NoArgsConstructor
@AllArgsConstructor @Builder
public class BankAccount {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private Date createdAt;
    private double balance;
    private String currency;
    private AccoutType type;

}
