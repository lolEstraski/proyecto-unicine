package co.uniquindio.unicine.entidades;


import lombok.*;

import javax.persistence.*;
import javax.swing.*;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Cliente implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String cedula;
    @Column(nullable = false, length = 200)
    private String nombreCompleto;
    @Column(nullable = false, length = 200)
    private String email;

    @Column(nullable = false)
    private String urlFoto;
    @Column(nullable = false, length = 200)
    private String direccion;

    @Column(nullable = false, length = 200, unique = true)
    private String usuario;

    @Column(nullable = false, length = 200, unique = true)
    private String contrasenia;

    @Column(length = 10, unique = true)
    private int codTarjeta;

    @Column(nullable = false)
    @Enumerated
    private Estado estado;

    //relaciones

    @OneToOne(mappedBy = "cliente")
    @ToString.Exclude
    private EncuestaSatisfaccion encuesta;

    @ElementCollection
    private List<String> telefonos;

    @ToString.Exclude
    @OneToMany(mappedBy = "cliente")
    private List<Cupon> cupones;

    @ToString.Exclude
    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;

    public Cliente(String cedula, String nombreCompleto, String email, String direccion, List<String> telefonos) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.direccion = direccion;
        this.telefonos = telefonos;
    }
}
