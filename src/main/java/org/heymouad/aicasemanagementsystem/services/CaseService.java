package org.heymouad.aicasemanagementsystem.services;

import org.heymouad.aicasemanagementsystem.entities.Case;

import java.util.List;

public interface CaseService {
    Case createCase(Case newCase);
    List<Case> getAllCases();
}
