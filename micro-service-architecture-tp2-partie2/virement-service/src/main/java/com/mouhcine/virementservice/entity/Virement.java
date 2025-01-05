package com.mouhcine.virementservice.entity;

import com.mouhcine.virementservice.dtos.BeneficiaireDto;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Virement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long idBneficiaire;
    private String ribSource;
    private double montantVirement;
    private Date dateVirement;
    private String description;
    @Transient
    private BeneficiaireDto beneficiaireDto;

}
