package org.heymouad.aicasemanagementsystem.controllers;


import org.heymouad.aicasemanagementsystem.dtos.CaseResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/cases")
@RestController
public class CaseController {

    @PostMapping
    public ResponseEntity<CaseResponse> CreateCase()
    {
        return null;
    }

    @GetMapping
    public ResponseEntity<List<CaseResponse>> GetCases()
    {
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<CaseResponse> UpdateCase(@PathVariable("id") Long id)
    {
        return null;
    }
}
