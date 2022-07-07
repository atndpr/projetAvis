package fr.orsys.antmad.projetavis.business;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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

public class Avis {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String description; 
	private LocalDateTime dateEnvoi; 
	private Float note; 
	private LocalDateTime dateModeration;
	@ManyToOne
	private Joueur joueur; 
	@ManyToOne
	private Jeu jeu; 
	@ManyToOne
	private Moderateur moderateur; 
}
