package com.mouhcine.virementservice.dtos;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BeneficiaireDto {
    private Long id;
    private String nom;
    private String prenom;
    private String rib;
}
