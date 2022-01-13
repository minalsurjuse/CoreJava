package com.minal.crudoperations.test.service;

import com.minal.crudoperations.test.entity.BankAccount;
import com.minal.crudoperations.test.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService {
    @Autowired
    private BankRepository repository;

    //Post Method
    public BankAccount saveBankAccountHolder(BankAccount accountHolder){
        return repository.save(accountHolder);
    }

    //Post method for multiple entries
    public List<BankAccount> saveAllBankAccountHolders(List<BankAccount> accountHolders){
        return repository.saveAll(accountHolders);
    }

    //Get by id
    public BankAccount getBankAccountHolderById(int id){

        return repository.findById(id).orElse(null);
    }

    //Get by name
    public BankAccount getBankAccountHolderByName(String name){

        return repository.findByName(name);
    }

    //Get All
    public List<BankAccount> getAllBankAccountHolders(){

        return repository.findAll();
    }

    //Get all using id
    public List<BankAccount> getAllBankAccountHoldersById(List<Integer> ids) {

        return repository.findAllById(ids);
    }

    //Update
    public BankAccount updateBankAccountHolder(BankAccount accountHolder){
        BankAccount existingBankAccountHolder = repository.findById(accountHolder.getId()).orElse(null);
        existingBankAccountHolder.setName(accountHolder.getName());
        existingBankAccountHolder.setAccNumber(accountHolder.getAccNumber());
        existingBankAccountHolder.setBalance(accountHolder.getBalance());
        return repository.save(existingBankAccountHolder);
    }

    //Delete by id
    public String deleteBankAccountHolderById(int id){
        repository.deleteById(id);
        return "BankAccountHolder "+id+" deleted";
    }
}
