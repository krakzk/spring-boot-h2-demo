package com.taintedmonk.h2learning.h2demoapp.service;

import org.springframework.stereotype.Service;

@Service
public class AccountIdGenerationService {

    public Long newAccountId(){
        return System.nanoTime();
    }
}
