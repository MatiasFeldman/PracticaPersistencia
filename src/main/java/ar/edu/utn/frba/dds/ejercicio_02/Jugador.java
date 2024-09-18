package ar.edu.utn.frba.dds.ejercicio_02;

import ar.edu.utn.frba.dds.ejercicio_02.elementos.ElementoDefensor;
import ar.edu.utn.frba.dds.ejercicio_02.personajes.Personaje;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "jugador")
public class Jugador {
  @Id @GeneratedValue
  private Long id;
  @Column(name = "nombre", nullable = false)
  private String nombre;
  @Column(name = "apellido", nullable = false)
  private String apellido;
  @Column(name = "fecha_alta", nullable = false)
  private LocalDate fechaAlta;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "personaje_id")
  private Personaje personaje;

  public Jugador() {
    this.fechaAlta = LocalDate.now();
  }

  public void cambiarPersonaje(Personaje personaje) {
    this.personaje = personaje;
  }
}
