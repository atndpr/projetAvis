package fr.orsys.antmad.projetavis.business;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Plateforme {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String nom;
    @ManyToMany (mappedBy = "plateformes")
    private List<Jeu> jeux;
}
