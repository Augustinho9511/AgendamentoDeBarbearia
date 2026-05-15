package sistema_barbearia.exception;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ErroResposta {

    private int statusHttp;
    private String mensagem;
    private LocalDateTime dataHoraErro;

    public ErroResposta(int statusHttp, String mensagem) {
        this.statusHttp = statusHttp;
        this.mensagem = mensagem;
        this.dataHoraErro = LocalDateTime.now();
    }
}
