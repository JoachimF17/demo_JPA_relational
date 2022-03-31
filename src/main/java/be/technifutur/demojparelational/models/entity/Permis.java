package be.technifutur.demojparelational.models.entity;

import be.technifutur.demojparelational.models.TypePermis;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "permis")
public class Permis
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "permis_id", nullable = false, columnDefinition = "INT(11)")
    private Long id;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "permis_type", nullable = false, updatable = false, length = 5)
    private TypePermis type;

    @Column(name = "permis_delivered", nullable = false, updatable = false)
    private LocalDate delivrance;

    @ManyToOne
    private Utilisateur user;
}