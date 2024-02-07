package com.demo.Assignment1.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class Controller {

    @Value("${bank.name}")
    private String bankName;

    @Value("${bank.address}")
    private String bankAddress;
    @GetMapping("/name")
    public String getBankName()
    {
        return bankName;
    }
    @GetMapping("/address")
    public String getBankAddress()
    {
        return bankAddress;
    }
}
