package com.taintedmonk.h2learning.h2demoapp.controller;

import com.taintedmonk.h2learning.h2demoapp.entity.AccountEntity;
import com.taintedmonk.h2learning.h2demoapp.service.AccountQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "/account")
public class AccountQueryController {

    @Autowired
    private AccountQueryService accountQueryService;

    @GetMapping("/{accountId}")
    public ResponseEntity<AccountEntity> getAccountById(@PathVariable(value = "accountId") Long accountId){
        Optional<AccountEntity> accountOpt = accountQueryService.getAccountById(accountId);
        return accountOpt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/listAccounts")
    public List<AccountEntity> getAccounts(){
        List<AccountEntity> sample = accountQueryService.getAccounts();
        return accountQueryService.getAccounts();
    }
}
