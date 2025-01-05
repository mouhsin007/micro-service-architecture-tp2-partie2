package com.mouhcine.beneficiaire_service.entity;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nom",types = Beneficiaire.class)
public interface BeneficiaireProjection {
    String getNom();
}
