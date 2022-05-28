package com.project.merchant.controller;

import com.project.merchant.entity.MerchantType;
import com.project.merchant.repository.MerchantTypeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class MerchantController {

    private MerchantTypeRepository merchantTypeRepository;

    MerchantController(MerchantTypeRepository merchantTypeRepository) {
        this.merchantTypeRepository = merchantTypeRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(MerchantController.class, args);
    }

    @GetMapping("/merchantType")
    public List<MerchantType> getMerchantType() {

        List<MerchantType> test = new ArrayList<>();

        MerchantType val = new MerchantType();
        val.setId("01");
        val.setType("tipe");
        val.setCreatedDate(LocalDateTime.now());

        test.add(val);

        return test;
    }
}
