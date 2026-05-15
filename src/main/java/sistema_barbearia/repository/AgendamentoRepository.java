package sistema_barbearia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import sistema_barbearia.model.entity.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {

    @Query("SELECT COUNT(a) FROM Agendamento a")
    Long contarTotalAgendamentos();

    @Query("SELECT SUM(a.valor) FROM Agendamento a")
    Double somarFaturamentoTotal();

    @Query("SELECT AVG(a.valor) FROM Agendamento a")
    Double calcularTicketMedio();
}
