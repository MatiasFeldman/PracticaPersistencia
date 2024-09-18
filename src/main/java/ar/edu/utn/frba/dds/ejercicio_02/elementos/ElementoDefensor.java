package ar.edu.utn.frba.dds.ejercicio_02.elementos;


import ar.edu.utn.frba.dds.ejercicio_02.personajes.Personaje;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "elemento_defensor")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_elemento", discriminatorType = DiscriminatorType.STRING)
public abstract class ElementoDefensor {
    @Id @GeneratedValue
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    public abstract void defenderA(Personaje personaje);

    // Otros atributos y métodos según sea necesario
}