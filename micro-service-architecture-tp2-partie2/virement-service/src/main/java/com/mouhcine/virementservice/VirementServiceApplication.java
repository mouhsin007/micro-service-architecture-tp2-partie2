package com.mouhcine.virementservice;

import com.mouhcine.virementservice.dtos.BeneficiaireDto;
import com.mouhcine.virementservice.entity.Virement;
import com.mouhcine.virementservice.feign.BeneficiaireRestClient;
import com.mouhcine.virementservice.repository.VirementRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class VirementServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VirementServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner start(VirementRepository virementRepository, BeneficiaireRestClient beneficiaireRestClient){
        return args -> {
            BeneficiaireDto beneficiaireDto = beneficiaireRestClient.getBeneficiaireById(1L);
            virementRepository.save(Virement.builder()
                            .dateVirement(new Date())
                            .description("nothing")
                            .montantVirement(23456)
                            .ribSource("1028")
                            .idBneficiaire(beneficiaireDto.getId())
                    .build());
        };
    }
}
