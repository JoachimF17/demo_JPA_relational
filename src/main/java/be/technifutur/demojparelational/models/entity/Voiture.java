package be.technifutur.demojparelational.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@Entity
@Table(name = "voiture")
public class Voiture
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, columnDefinition = "INT(11)")
    private Long id;

    @Column(name = "voiture_marque", length = 20, nullable = false)
    private String marque;

    @Column(name = "voiture_modele", length = 20, nullable = false)
    private String modele;

    @Column(name = "voiture_disponible", nullable = false)
    private boolean disponible;

    @Enumerated(EnumType.STRING)
    @Column(name = "voiture_carburant", length = 20, nullable = false)
    private Carburant carburant;

}