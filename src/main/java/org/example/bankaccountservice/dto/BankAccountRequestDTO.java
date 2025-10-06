package org.example.bankaccountservice.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.bankaccountservice.enums.AccoutType;

import java.util.Date;
@Data @AllArgsConstructor @Builder @NoArgsConstructor
public class BankAccountRequestDTO {
    private Double balance;
    private String currency;
    private AccoutType type;
}
