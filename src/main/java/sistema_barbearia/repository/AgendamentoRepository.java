package sistema_barbearia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sistema_barbearia.model.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
}
