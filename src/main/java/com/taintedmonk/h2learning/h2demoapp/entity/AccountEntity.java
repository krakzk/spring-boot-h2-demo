package com.taintedmonk.h2learning.h2demoapp.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "ACCOUNT") //not a must, but if not used classname will be taken as table name
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AccountEntity {

    @Id
    private long id;

    private String name;

    private BigDecimal balance;
}
