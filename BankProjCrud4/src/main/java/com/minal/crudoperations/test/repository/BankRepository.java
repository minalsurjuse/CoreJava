package com.minal.crudoperations.test.repository;

import com.minal.crudoperations.test.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<BankAccount, Integer > {
    BankAccount findByName(String name);
}
