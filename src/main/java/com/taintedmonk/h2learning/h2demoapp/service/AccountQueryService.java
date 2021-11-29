package com.taintedmonk.h2learning.h2demoapp.service;

import com.taintedmonk.h2learning.h2demoapp.entity.AccountEntity;
import com.taintedmonk.h2learning.h2demoapp.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountQueryService {

    @Autowired
    private AccountRepository accountRepository;

    public Optional<AccountEntity> getAccountById(Long accountId){
        return accountRepository.findById(accountId);
    }

    public List<AccountEntity> getAccounts(){
        return  accountRepository.findAll();
    }
}
