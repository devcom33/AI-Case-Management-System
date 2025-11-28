package org.heymouad.aicasemanagementsystem.entities;


import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Data
@RequiredArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String role;
    private LocalDate created_at;


    @PrePersist
    protected void onCreate() {
        if (this.created_at == null) {
            this.created_at = LocalDate.now();
        }
    }
}
