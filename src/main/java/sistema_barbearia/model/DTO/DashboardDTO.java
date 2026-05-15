package sistema_barbearia.model.DTO;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DashboardDTO {

    private Long totalAgendamento;
    private Double faturamentoTotal;
    private Double ticketMedio;
}
