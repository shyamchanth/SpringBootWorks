package com.example.Assignment2.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bankName;
    private String bankService;

    private String city;

    private String branch;
    public Bank()
    {

    }

    public Bank(String bankName, String bankService, String city, String branch) {
        this.bankName = bankName;
        this.bankService = bankService;
        this.city = city;
        this.branch = branch;
    }



    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankService() {
        return bankService;
    }

    public void setBankService(String bankService) {
        this.bankService = bankService;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
