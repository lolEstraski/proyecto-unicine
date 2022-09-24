package co.uniquindio.unicine.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Funcion implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String id;


    @ManyToOne
    private Compra compra;

    @OneToMany(mappedBy = "funcion")
    private List<Horario> horarios;

    @OneToMany(mappedBy = "funcion")
    private List<Sala> salas;

    @OneToMany(mappedBy = "funcion")
    private List<Pelicula> peliculas;

    @ManyToOne
    private EncuestaSatisfaccion encuesta;



}
