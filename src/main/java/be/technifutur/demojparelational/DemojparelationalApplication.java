package be.technifutur.demojparelational;

import be.technifutur.demojparelational.models.Carburant;
import be.technifutur.demojparelational.models.entity.Utilisateur;
import be.technifutur.demojparelational.models.entity.Voiture;
import be.technifutur.demojparelational.repository.UtilisateurRepository;
import be.technifutur.demojparelational.repository.VoitureRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemojparelationalApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemojparelationalApplication.class, args);

		VoitureRepository voitureRepository = context.getBean(VoitureRepository.class);
		UtilisateurRepository utilisateurRepository = context.getBean(UtilisateurRepository.class);

		Voiture v = new Voiture(
				0L,
				"marque",
				"modele",
				Carburant.DIESEL,
				true,
				null);
		Utilisateur u = new Utilisateur(
				10L,
				"username",
				"password",
				"nom",
				"prenom",
				null);

//		v = voitureRepository.save(v);
//		u = utilisateurRepository.save(u);

		
	}

}
