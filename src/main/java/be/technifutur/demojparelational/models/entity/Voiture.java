package be.technifutur.demojparelational.models.entity;

import be.technifutur.demojparelational.models.Carburant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@Entity
@Table(name = "voiture")
public class Voiture
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "voiture_id", nullable = false, columnDefinition = "INT(11)")
    private Long id;

    @Column(name = "voiture_marque", length = 20, nullable = false)
    private String marque;

    @Column(name = "voiture_modele", length = 20, nullable = false)
    private String modele;

    @Enumerated(EnumType.STRING)
    @Column(name = "voiture_carburant", length = 20, nullable = false)
    private Carburant carburant;

    @Column(name = "voiture_disponible", nullable = false)
    private boolean disponible;

    @ManyToMany(mappedBy = "voitures")
    private List<Utilisateur> proprietaires;
}