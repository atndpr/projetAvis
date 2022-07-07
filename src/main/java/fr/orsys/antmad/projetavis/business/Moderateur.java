package fr.orsys.antmad.projetavis.business;

import java.time.LocalDate;

import javax.persistence.Entity;

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

public class Moderateur extends Utilisateur {
	
	private String numeroDeTelephone; 
	
}
