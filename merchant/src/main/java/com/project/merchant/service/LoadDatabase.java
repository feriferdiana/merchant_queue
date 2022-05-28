package com.project.merchant.service;

import com.project.merchant.entity.MerchantType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.project.merchant.repository.MerchantTypeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    public CommandLineRunner initDatabase(MerchantTypeRepository repo) {

        MerchantType data = new MerchantType();
        data.setId("01");
        data.setType("Tipe");
        data.setCreatedDate(LocalDateTime.now());

        return args -> {
            log.info("Preloading " + repo.save(data));
        };
    }
}
