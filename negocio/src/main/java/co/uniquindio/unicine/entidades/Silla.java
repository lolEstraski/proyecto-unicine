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

public class Silla implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoSilla tipo;

    @Column(nullable = false)
    private Double precio;

    @ManyToMany(mappedBy = "sillas")
    private List<Compra> compras;

    @ManyToOne
    private Sala sala;



}
