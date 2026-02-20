package sistema_barbearia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sistema_barbearia.model.Agendamento;
import sistema_barbearia.service.AgendamentoService;
import java.util.List;

@RestController
@RequestMapping("/api/agendamentos")
@CrossOrigin("*")
public class AgendamentoController {

    @Autowired
    private AgendamentoService service;

    @GetMapping
    public List<Agendamento> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Agendamento buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public void salvar(@RequestBody Agendamento agendamento) {
        service.salvar(agendamento);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}