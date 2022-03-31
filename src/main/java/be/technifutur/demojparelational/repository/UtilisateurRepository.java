package be.technifutur.demojparelational.repository;

import be.technifutur.demojparelational.models.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>
{
}
