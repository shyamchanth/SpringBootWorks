package com.example.Assignment2.Controller;

import com.example.Assignment2.Model.Bank;
import com.example.Assignment2.Service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class BankController {

    @Autowired
    BankService bankService;

    @GetMapping("/")
    public String getAllBankDetails(Model model)
    {
        List<Bank> bankDetails = bankService.finByAll();
        model.addAttribute("details",bankService.finByAll());
        return "bankDetails";
    }

    @GetMapping("city/{city}")
    public String getCityByName(Model model, @PathVariable String city)
    {
        List<Bank> branches = bankService.findByBranchName(city);
        model.addAttribute("branch",branches);
        return "findByCityName";
    }

    @GetMapping("bankname/{bankName}")
    public String getBankByName(Model model, @PathVariable String bankName)
    {
        List<Bank> BankNameList = bankService.findByBankName(bankName);
        model.addAttribute("nameList",BankNameList);
        return "findByBankName";
    }
}
