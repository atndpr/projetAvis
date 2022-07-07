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
public class ModeleEconomique {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "modeleEconomique")
    private List<Jeu> jeux;
}
