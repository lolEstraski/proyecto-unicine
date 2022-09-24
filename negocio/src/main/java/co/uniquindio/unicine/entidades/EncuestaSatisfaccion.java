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
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class EncuestaSatisfaccion implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String id;

    @Column(nullable = false)
    private Integer calificacion;

    @OneToOne
    private Cliente cliente;

    @OneToMany(mappedBy = "encuesta")
    private List<Funcion> funciones;


}
