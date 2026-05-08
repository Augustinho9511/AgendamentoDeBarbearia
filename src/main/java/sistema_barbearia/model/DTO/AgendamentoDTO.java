package sistema_barbearia.model.DTO;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
public class AgendamentoDTO {

    @NotNull(message = "A data deve ser informada")
    private LocalDate data;

    @NotNull(message = "O horário deve ser informada")
    private LocalTime horario;

    private ClienteDTO cliente;
}
