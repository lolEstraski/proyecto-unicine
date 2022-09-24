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

public class Sala implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String id;

    private String tipoSala;

    @Column(nullable = false,unique = true, length = 10)
    private Integer numSala;

    @ManyToOne
    private Funcion funcion;

    @ManyToOne
    private Teatro teatro;

    @OneToMany(mappedBy = "sala")
    private List<Silla> sillas;




}
