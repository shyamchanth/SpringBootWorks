package com.example.Assignment2;

import com.example.Assignment2.Model.Bank;
import com.example.Assignment2.Respository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Assignment2Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Assignment2Application.class, args);
    }

    @Autowired
    BankRepository bankRepository;

    @Override
    public void run(String... args) throws Exception {

        Bank bank1 = new Bank("sbi", "savings", "bangalore", "bangalodyza");
        Bank bank2 = new Bank("sbi", "current", "chennai", "chennai");
        Bank bank3 = new Bank("sbi", "savings", "bangalore", "bangalorunafa");
        Bank bank4 = new Bank("icici", "savings", "chennai", "chennai");
        Bank bank5 = new Bank("icici", "current", "bangalore", "bangalokeska");
        Bank bank6 = new Bank("icici", "savings", "chennai", "chennai");
        Bank bank7 = new Bank("canara", "current", "bangalore", "bangalnreafa");
        Bank bank8 = new Bank("canara", "current", "chennai", "chennai");
        Bank bank9 = new Bank("canara", "savings", "bangalore", "bangalonrea");
        Bank bank10 = new Bank("axis", "savings", "chennai", "chennai");
        Bank bank11 = new Bank("axis", "savings,current", "bangalore", "bangalorefsu");
        Bank bank12 = new Bank("axis", "savings,current", "chennai", "chennai");
        Bank bank13 = new Bank("cub", "savings", "bangalore", "bangalnreafa");
        Bank bank14 = new Bank("cub", "current", "chennai", "chennai");
        Bank bank15 = new Bank("cub", "savings,current", "bangalore", "bangalonrea");
        Bank bank16 = new Bank("dbs", "savings", "chennai", "chennai");
        Bank bank17 = new Bank("dbs", "savings", "bangalore", "bangalorefsu");
        Bank bank18 = new Bank("dbs", "savings,current", "bangalore", "cafshsad");
        Bank bank19 = new Bank("dbs", "savings", "bangalore", "cafshsad");
        Bank bank20 = new Bank("cub", "savings", "bangalore", "bangalnreafa");
        Bank bank21 = new Bank("cub", "savings", "bangalore", "bangalnreafa");




        bankRepository.save(bank1);
        bankRepository.save(bank2);
        bankRepository.save(bank3);
        bankRepository.save(bank4);
        bankRepository.save(bank5);
        bankRepository.save(bank6);
        bankRepository.save(bank7);
        bankRepository.save(bank8);
        bankRepository.save(bank9);
        bankRepository.save(bank10);
        bankRepository.save(bank11);
        bankRepository.save(bank12);
        bankRepository.save(bank13);
        bankRepository.save(bank14);
        bankRepository.save(bank15);
        bankRepository.save(bank16);
        bankRepository.save(bank17);
        bankRepository.save(bank18);
        bankRepository.save(bank19);
        bankRepository.save(bank20);
        bankRepository.save(bank21);

    }

}
