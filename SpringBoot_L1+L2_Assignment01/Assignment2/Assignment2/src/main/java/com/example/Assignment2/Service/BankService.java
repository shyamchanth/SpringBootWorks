package com.example.Assignment2.Service;

import com.example.Assignment2.Model.Bank;
import com.example.Assignment2.Respository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService {
    @Autowired
    BankRepository bankRepository;

    public List<Bank> finByAll()
    {
        return bankRepository.findAll();
    }

    public List<Bank> findByBranchName(String city)
    {
        return bankRepository.findTop10ByCity(city);
    }

    public List<Bank> findByBankName(String branchName)
    {
        return bankRepository.findByBankName(branchName);
    }
}

