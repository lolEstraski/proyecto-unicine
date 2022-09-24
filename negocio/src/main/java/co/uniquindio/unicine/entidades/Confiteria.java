package co.uniquindio.unicine.entidades;

import lombok.*;

import javax.persistence.*;
import javax.swing.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Confiteria implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String id;

    @Column(nullable = false)
    private Double precio;

    private ImageIcon imagenConfiteria;

    @Column(nullable = false)
    private  String nombreAlimento;

    @ManyToMany(mappedBy = "confiteria")
    private List<Compra> compra;



}
