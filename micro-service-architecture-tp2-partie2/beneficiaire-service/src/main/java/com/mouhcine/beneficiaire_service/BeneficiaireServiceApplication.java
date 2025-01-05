package com.mouhcine.beneficiaire_service;

import com.mouhcine.beneficiaire_service.entity.Beneficiaire;
import com.mouhcine.beneficiaire_service.enums.TypeEnum;
import com.mouhcine.beneficiaire_service.repository.Beneficiairerepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
@EnableDiscoveryClient
public class BeneficiaireServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeneficiaireServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(Beneficiairerepository beneficiairerepository){
        return args -> {
            beneficiairerepository.save(Beneficiaire.builder()
                    .rib("1027")
                    .nom("elq")
                    .prenom("moh")
                    .typeEnum(TypeEnum.PHYSIQUE)
                    .build());
        };
    }
}
