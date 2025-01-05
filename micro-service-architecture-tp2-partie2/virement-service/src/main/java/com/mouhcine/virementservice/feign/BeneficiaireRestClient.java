package com.mouhcine.virementservice.feign;

import com.mouhcine.virementservice.dtos.BeneficiaireDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "beneficiaire-service")
public interface BeneficiaireRestClient {
    @GetMapping("/beneficiaires/{id}")
    BeneficiaireDto getBeneficiaireById(@PathVariable Long id) ;
    @GetMapping("/beneficiaire/{id}")
    PagedModel<BeneficiaireDto> getAllBeneficiaires() ;

}
