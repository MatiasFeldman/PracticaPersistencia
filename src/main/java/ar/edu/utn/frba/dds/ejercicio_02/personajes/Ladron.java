package ar.edu.utn.frba.dds.ejercicio_02.personajes;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "ladron")
public class Ladron extends Personaje{
  @Column(name = "nivel_siniestro", nullable = false)
  private Integer nivelSiniestro;
  @Column(name = "tiene_navaja", nullable = false)
  private Boolean tieneNavaja;

  @Override
  public void atacar(Personaje personaje) {
 //TODO
  }
}
