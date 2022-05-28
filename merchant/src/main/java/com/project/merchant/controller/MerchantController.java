package com.project.merchant.controller;

import com.project.merchant.entity.MerchantType;
import com.project.merchant.repository.MerchantTypeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
public class MerchantController {

    public static void main(String[] args) {
        SpringApplication.run(MerchantController.class, args);
    }

    private MerchantTypeRepository merchantTypeRepository;

    // Merchant Type
    @GetMapping("/merchantType")
    public List<MerchantType> getMerchantType() {
        return merchantTypeRepository.findAll();
    }

    @PostMapping("/mercgabtType")
    public void insertMerchantType(){
        // insert type
    }

    // Merchant Menu
    @GetMapping("/merchantMenu")
    public void getMerchantMenu(){
        // get menu
    }

    @PostMapping("/merchantMenu")
    public void insertMerchantMenu(){
        // insert menu
    }

    // Merchant
    @GetMapping("/merchant")
    public void merchant(@RequestParam(value = "id") String id){
        // get by id merchant
    }

    // Merchant Order
    @GetMapping("merchantOrder")
    public void merchantOrder(@RequestParam(value = "idMerchant") String id){
        // get number order in today
    }

    @PostMapping("merchantOrder")
    public void insertOrderMerchant(){
        // save order in progress in merchant
    }
}
