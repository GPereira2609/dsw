package repository;

import model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, String> {
     List<Cliente> findAll();

     Cliente findByCpf(String cpf);
}
