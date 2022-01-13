package com.minal.crudoperations.test.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="BankAccountHolders")
public class BankAccount {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private long accNumber;
    private double balance;

}
