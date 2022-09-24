package co.uniquindio.unicine.entidades;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Horario implements Serializable {

        @Id
        @EqualsAndHashCode.Include
        private String id;
        @Column(nullable = false)
        private int dia;
        @Column(nullable = false)
        private LocalDateTime hora;

        @ManyToOne
        private Funcion funcion;


}
