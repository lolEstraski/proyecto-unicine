package co.uniquindio.unicine.entidades;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Compra implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(nullable = false)
    private Double valorTotal;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private MetodoPago metodoPago;

    @Column(nullable = false)
    private LocalDateTime fecha;

    @ManyToOne
    private Cliente cliente;

    @ManyToMany
    private List<Confiteria> confiteria;

    @OneToOne(mappedBy = "compra")
    private Cupon cupon;

    @OneToMany(mappedBy = "compra")
    private List<Funcion> funciones;

    @ManyToMany
    @JoinTable(name = "entrada", joinColumns = @JoinColumn(name = "codigo_compra"),
            inverseJoinColumns = @JoinColumn(name = "codigo_silla")

    )
    private List<Silla> sillas;


}
