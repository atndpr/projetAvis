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
public class Classification {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String nom;
    @OneToMany (mappedBy = "classification")
    private List<Jeu> jeux;
}
