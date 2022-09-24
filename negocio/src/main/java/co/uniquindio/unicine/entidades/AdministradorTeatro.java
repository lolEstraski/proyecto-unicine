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
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@ToString
public class AdministradorTeatro implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String id;
    @Column(nullable = false, length = 10, unique = true)
    private Integer cedula;
    @Column(nullable = false)
    private String nombreCompleto;
    @Column(nullable = false, unique = true, length = 10)
    private Integer telefono;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private ImageIcon imagenPerfil;

    @ManyToOne
    private Teatro teatro;

}
