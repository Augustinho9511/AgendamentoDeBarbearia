package sistema_barbearia.model.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ClienteDTO {

    @NotBlank(message = "O nome é obrigatoório")
    private String nome;

    @NotBlank(message = "O telefone é obrigatoório")
    private String telefone;

    @NotBlank(message = "O email é obrigatoório")
    private String email;
}
