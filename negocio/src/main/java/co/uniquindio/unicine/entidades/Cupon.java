package co.uniquindio.unicine.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Cupon implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String id;

    @Column(nullable = false)
    private Date fechaExpiracion;

    @Column(nullable = false)
    private String concepto;

    @Column(nullable = false)
    private Double descuento;

    @ManyToOne
    private Cliente cliente;

    @OneToOne
    private Compra compra;


}
