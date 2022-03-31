package be.technifutur.demojparelational.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "utilisateur")
public class Utilisateur
{
    @Id
    @Column(name = "user_id", columnDefinition = "INT(11)", nullable = false)
    private Long id;

    @Column(name = "user_username", nullable = false, unique = true, length = 50)
    private String username;

    @Column(name = "user_password", nullable = false, length = 50)
    private String password;

    @Column(name = "user_surname", nullable = false, length = 30)
    private String nom;

    @Column(name = "user_name", nullable = false, length = 30)
    private String prenom;

    @ManyToMany
    private List<Voiture> voitures;
}