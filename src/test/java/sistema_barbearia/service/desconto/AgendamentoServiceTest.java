package sistema_barbearia.service.desconto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import sistema_barbearia.model.entity.Agendamento;
import sistema_barbearia.repository.AgendamentoRepository;
import sistema_barbearia.service.AgendamentoService;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class AgendamentoServiceTest {

    @Mock
    private AgendamentoRepository repository;

    @InjectMocks
    private AgendamentoService service;

    @Test
    void deveBuscarAgendamentoPorIdComSucesso() {
        Agendamento agendamentoFalso = new Agendamento();
        agendamentoFalso.setId(1L);
        Mockito.when(repository.findById(1L)).thenReturn(Optional.of(agendamentoFalso));
        Agendamento resultado = service.buscarPorId(1L);
        assertNotNull(resultado);
        assertEquals(1L, resultado.getId());
    }
}
