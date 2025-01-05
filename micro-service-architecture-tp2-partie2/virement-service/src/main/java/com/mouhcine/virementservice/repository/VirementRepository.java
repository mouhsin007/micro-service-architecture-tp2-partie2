package com.mouhcine.virementservice.repository;

import com.mouhcine.virementservice.entity.Virement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VirementRepository extends JpaRepository<Virement, Long> {
}
