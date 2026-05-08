package sistema_barbearia.model;

import org.junit.jupiter.api.Test;
import sistema_barbearia.model.entity.Agendamento;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AgendamentoTest {

    @Test
    void deveRetornarFalseQuandoDataForNoPassado() {

        Agendamento agendamento = new Agendamento();
        agendamento.setData(LocalDate.now().minusDays(1));
        boolean resultado = agendamento.isDataValida();
        assertFalse(resultado);
    }

    @Test
    void deveRetornarVerdadeiroQuandoDataForNoFuturo() {

        Agendamento agendamento = new Agendamento();
        agendamento.setData(LocalDate.now().plusDays(1));
        boolean resultado = agendamento.isDataValida();
        assertTrue(resultado);
    }

}