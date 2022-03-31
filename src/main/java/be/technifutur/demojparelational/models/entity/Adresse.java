package be.technifutur.demojparelational.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "adresse")
public class Adresse
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INT(11)", nullable = false)
    private Long id;

    @Column(name = "adresse_rue", nullable = false, length = 70)
    private String rue;

    @Column(name = "adresse_numero", nullable = false, length = 10)
    private String numero;

    @Column(name = "adresse_code_postal", columnDefinition = "INT(10)", nullable = false)
    private int codePostal;

    @Column(name = "adresse_localite", nullable = false, length = 50)
    private String localite;

    @OneToOne(mappedBy = "adresse")
    private Utilisateur user;
}