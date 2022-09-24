package co.uniquindio.unicine.entidades;

import lombok.*;

import javax.persistence.*;
import javax.print.DocFlavor;
import javax.swing.*;
import java.io.Serializable;
import java.net.URL;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Pelicula implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String id;

    @Column(nullable = false)
    private Double duracion;

    @Column(nullable = false)
    private String rangoEdad;

    private String nombreDirector;

    private String nombreEstudio;

    @Column(nullable = false)
    private String imagenPelicula;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Genero genero;

    @Column(nullable = false)
    private String estadoPelicula;

    private String elenco;

    @Column(nullable = false,unique = true)
    private String urlTrailer;

    @Column(nullable = false)
    private String sinopsis;


    @ManyToOne
    private Funcion funcion;

}
