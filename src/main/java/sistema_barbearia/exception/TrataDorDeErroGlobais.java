package sistema_barbearia.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TrataDorDeErroGlobais {

    @ExceptionHandler(AgendamentoNaoEncontradoException.class)
    public ResponseEntity<ErroResposta> tratarAgendamentoNaoEncontrado(AgendamentoNaoEncontradoException ex) {
        ErroResposta erroLimpo = new ErroResposta(
                HttpStatus.NOT_FOUND.value(),
                ex.getMessage()
        );

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erroLimpo);
    }
}
