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
public class Editeur {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany (mappedBy = "editeur")
    private List<Jeu> jeux;
}
