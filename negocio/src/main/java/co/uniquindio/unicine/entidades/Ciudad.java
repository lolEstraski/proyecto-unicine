package co.uniquindio.unicine.entidades;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Entity
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Ciudad implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String id;
    @Column(length = 10, nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "ciudad")
    private List<Teatro> teatros;



}
