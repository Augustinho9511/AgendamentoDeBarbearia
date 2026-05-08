package sistema_barbearia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sistema_barbearia.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
