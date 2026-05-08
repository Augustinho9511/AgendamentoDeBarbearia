package sistema_barbearia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sistema_barbearia.model.entity.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
}
