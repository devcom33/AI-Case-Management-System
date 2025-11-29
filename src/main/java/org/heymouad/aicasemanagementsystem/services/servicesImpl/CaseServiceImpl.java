package org.heymouad.aicasemanagementsystem.services.servicesImpl;

import lombok.RequiredArgsConstructor;
import org.heymouad.aicasemanagementsystem.entities.Case;
import org.heymouad.aicasemanagementsystem.repositories.CaseRepository;
import org.heymouad.aicasemanagementsystem.services.CaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CaseServiceImpl implements CaseService {
    private final CaseRepository caseRepository;

    @Override
    public Case createCase(Case newCase) {
        return caseRepository.save(newCase);
    }

    @Override
    public List<Case> getAllCases() {
        return caseRepository.findAll();
    }


}
