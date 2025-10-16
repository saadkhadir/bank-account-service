package org.example.bankaccountservice;

import org.example.bankaccountservice.entities.BankAccount;
import org.example.bankaccountservice.entities.Customer;
import org.example.bankaccountservice.enums.AccoutType;
import org.example.bankaccountservice.repositories.BankAccountRepository;
import org.example.bankaccountservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class BankAccountServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankAccountServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(BankAccountRepository bankAccountRepository, CustomerRepository customerRepository) {
        return args -> {
            Stream.of("Mohamed","Ahmed","Yassine").forEach(c->{
                Customer customer=Customer.builder()
                        .name(c)
                        .build();
                customerRepository.save(customer);
            });
            customerRepository.findAll().forEach(customer->{
                for (int i=0; i<10; i++){
                    BankAccount bankAccount=BankAccount.builder()
                            .id(UUID.randomUUID().toString())
                            .balance(Math.random()*9000)
                            .createdAt(new Date())
                            .currency("MAD")
                            .type(Math.random()>0.5? AccoutType.CURRENT_ACCOUNT: AccoutType.SAVING_ACCOUNT)
                            .customer(customer)
                            .build();
                    bankAccountRepository.save(bankAccount);
                }
            });

     };

}
}
