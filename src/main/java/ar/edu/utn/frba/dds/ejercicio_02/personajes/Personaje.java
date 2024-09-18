package ar.edu.utn.frba.dds.ejercicio_02.personajes;

import ar.edu.utn.frba.dds.ejercicio_02.elementos.ElementoDefensor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "personaje")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_personaje", discriminatorType = DiscriminatorType.STRING)
public abstract class Personaje {
  @Id @GeneratedValue
  private Long id;
  @Getter
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "personaje_id")
  private List<ElementoDefensor> elementos;

  @Getter @Setter
  @Column(name = "estamina", nullable = false)
  private Integer estamina;

  @Getter @Setter
  @Column(name = "puntos_de_vida", nullable = false)
  private Integer puntosDeVida;

  public Personaje(){
    this.elementos = new ArrayList<>();
  }

  public void atacar(Personaje personaje) {
  //todo
  }

  public void agregarElemento(ElementoDefensor elemento){
    this.elementos.add(elemento);
  }

}
