package com.mouhcine.beneficiaire_service.repository;

import com.mouhcine.beneficiaire_service.entity.Beneficiaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Beneficiairerepository extends JpaRepository<Beneficiaire, Long> {
}
