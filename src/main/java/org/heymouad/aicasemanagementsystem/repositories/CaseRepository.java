package org.heymouad.aicasemanagementsystem.repositories;

import org.heymouad.aicasemanagementsystem.entities.Case;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaseRepository extends JpaRepository<Case, Long> {
}
