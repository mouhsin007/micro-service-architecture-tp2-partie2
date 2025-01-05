package com.mouhcine.beneficiaire_service.entity;

import com.mouhcine.beneficiaire_service.enums.TypeEnum;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter
@Setter @ToString @Builder
public class Beneficiaire {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;
    private String rib;
    @Enumerated(EnumType.STRING)
    private TypeEnum typeEnum;
}
