package org.heymouad.aicasemanagementsystem.entities;

import jakarta.persistence.*;
import lombok.*;
import org.heymouad.aicasemanagementsystem.enums.CasePriority;
import org.heymouad.aicasemanagementsystem.enums.CaseStatus;

import java.util.Objects;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cases")
public class Case {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private String category;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CasePriority priority;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CaseStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Case)) return false;
        Case aCase = (Case) o;
        return id != null && Objects.equals(id, aCase.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
