package fr.orsys.antmad.projetavis.business;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Jeu {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String nom;
    private String description;
    private LocalDate dateSortie;
    private String image;
    @ManyToOne
    private ModeleEconomique modeleEconomique;
    @ManyToMany
    private List<Plateforme> plateformes;
    @ManyToOne
    private Genre genre;
    @ManyToOne
    private Editeur editeur;
    @ManyToOne
    private Classification classification;
}
