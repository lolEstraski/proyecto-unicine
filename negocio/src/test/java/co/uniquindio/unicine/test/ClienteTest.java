package co.uniquindio.unicine.test;

import co.uniquindio.unicine.entidades.Cliente;
import co.uniquindio.unicine.repositorio.ClienteRepositorio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ClienteTest {

    @Autowired
    private ClienteRepositorio clienteRepo;



    @Test
    @Sql("classpath:dataset.sql" )
    public void registrar(){

        List<String> telefonos = new ArrayList<>();
        telefonos.add("3212644521");
        Cliente cliente = new Cliente("1007303046","luis","a@gmail.com", "villa del carmen",telefonos);
        Cliente guardado =  clienteRepo.save(cliente);
        Assertions.assertNotNull(guardado);
    }
    @Test
    @Sql("classpath:dataset.sql" )
    public void eliminar(){

        Cliente buscado =  clienteRepo.findById("1007303046").orElse(null);

        clienteRepo.delete(buscado);
        Assertions.assertNull(clienteRepo.findById("1007303046").orElse(null));
    }

    @Test
    @Sql("classpath:dataset.sql" )
    public void actualizar(){

        Cliente guardado = clienteRepo.findById("1007303046").orElse(null);
        guardado.setNombreCompleto("Alejandra");

        Cliente nuevo = clienteRepo.save(guardado);

        Assertions.assertEquals("Alejandra",nuevo.getNombreCompleto());

    }

    @Test
    @Sql("classpath:dataset.sql" )
    public void obtener(){
        Optional <Cliente> buscado = clienteRepo.findById("1007303046");

        System.out.println(buscado.orElse(null));
    }

    @Test
    @Sql("classpath:dataset.sql" )
    public void listar(){

        List<Cliente> lista = clienteRepo.findAll();
        lista.forEach(System.out::println);

    }


}
