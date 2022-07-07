package fr.orsys.antmad.projetavis.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

public abstract class Utilisateur {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected Long id; 
	protected String psuedo; 
	protected String motDePasse; 
	protected String email; 

}
