package ar.edu.utn.frba.dds.ejercicio_02.personajes;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@DiscriminatorValue("mago")
public class Mago  extends Personaje{
  @Column(name = "nivel_de_magia", nullable = false)
  private Integer nivelDeMagia;
  @Column(name = "tiene_alas", nullable = false)
  private Boolean tieneAlas;

  @Override
  public void atacar(Personaje personaje) {
 //TODO
  }


}
