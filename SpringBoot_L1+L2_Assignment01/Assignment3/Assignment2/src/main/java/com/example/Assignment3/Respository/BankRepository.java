package com.example.Assignment2.Respository;

import com.example.Assignment2.Model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {

    List<Bank> findTop10ByCity(String city);


    List<Bank> findByBankName(String bankName);
}
