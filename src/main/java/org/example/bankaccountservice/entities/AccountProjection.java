package org.example.bankaccountservice.entities;

import org.example.bankaccountservice.enums.AccoutType;
import org.springframework.data.rest.core.config.Projection;

import java.math.BigDecimal;

import static org.aspectj.apache.bcel.Constants.types;

@Projection(types=BankAccount.class, name = "p1")
public interface AccountProjection {
    public AccoutType getType();
    public String id();
    public Double getBalance();

}
