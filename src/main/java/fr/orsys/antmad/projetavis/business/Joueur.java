package fr.orsys.antmad.projetavis.business;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Joueur extends Utilisateur {

	private LocalDate dateDeNaissance;
	@OneToMany(mappedBy = "joueur")
	private List<Avis> avis; 
	
}
