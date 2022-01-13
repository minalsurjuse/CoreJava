package com.minal.crudoperations.test.controller;

import com.minal.crudoperations.test.entity.BankAccount;
import com.minal.crudoperations.test.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BankController {

    @Autowired
    private BankService service;

    //Post
    @PostMapping("/addAccountHolder")
    public BankAccount addBankAccountHolder(@RequestBody BankAccount accountHolder){
        return service.saveBankAccountHolder(accountHolder);
    }

    //Post
    @PostMapping("/addAccountHolder")
    public List<BankAccount> addAllBankAccountHolders(@RequestBody List<BankAccount> accountHolder){
        return service.saveAllBankAccountHolders(accountHolder);
    }

    //Get
    @GetMapping("/accountHolders")
    public List<BankAccount> findAllBankAccountHolders(){

        return service.getAllBankAccountHolders();
    }

    //Get by id
    @GetMapping("/accountHolder/{id}")
    public BankAccount findBankAccountHolderById(@PathVariable int id) {

        return service.getBankAccountHolderById(id);
    }

    //Get by name
    @GetMapping("/accountHolderName/{name}")
    public BankAccount findBankAccountHolderByName(@PathVariable(name="name") String name) {
        return service.getBankAccountHolderByName(name);
    }

    //Delete
    @DeleteMapping("/delete/{id}")
    public String deleteBankAccountHolder(@PathVariable int id) {

        return service.deleteBankAccountHolderById(id);
    }

    //Update
    @PutMapping("/update")
    public BankAccount updateBankAccountHolder(@RequestBody BankAccount accountHolder) {
        return service.updateBankAccountHolder(accountHolder);
    }

}
