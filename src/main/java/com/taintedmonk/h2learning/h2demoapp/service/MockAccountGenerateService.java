package com.taintedmonk.h2learning.h2demoapp.service;

import com.taintedmonk.h2learning.h2demoapp.entity.AccountEntity;
import com.taintedmonk.h2learning.h2demoapp.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class MockAccountGenerateService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private AccountIdGenerationService accountIdGenerationService;

    public void generateAccounts(){
        /*creating values into the entity using the Lombok
            builder that was added in Entity
         */
        AccountEntity accountEntity1 = AccountEntity.builder()
                .id(accountIdGenerationService.newAccountId())
                .balance(new BigDecimal(1000))
                .name("Swiss Account")
                .build();
        accountRepository.save(accountEntity1);

        AccountEntity accountEntity2 = AccountEntity.builder()
                .id(accountIdGenerationService.newAccountId())
                .balance(new BigDecimal(2000))
                .name("Bahamas Account")
                .build();
        accountRepository.save(accountEntity2);

    }
}
