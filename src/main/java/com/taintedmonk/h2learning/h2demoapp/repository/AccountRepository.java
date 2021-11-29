package com.taintedmonk.h2learning.h2demoapp.repository;

import com.taintedmonk.h2learning.h2demoapp.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<AccountEntity, Long> {
}
