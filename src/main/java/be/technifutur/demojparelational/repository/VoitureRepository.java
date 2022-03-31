package be.technifutur.demojparelational.repository;

import be.technifutur.demojparelational.models.entity.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoitureRepository extends JpaRepository<Voiture, Long>
{
}
