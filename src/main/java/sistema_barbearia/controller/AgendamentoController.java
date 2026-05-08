package sistema_barbearia.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sistema_barbearia.model.entity.Agendamento;
import sistema_barbearia.model.DTO.AgendamentoDTO;
import sistema_barbearia.service.AgendamentoService;
import java.util.List;

@RestController
@RequestMapping("/api/agendamentos")
@CrossOrigin("*")
public class AgendamentoController {

    @Autowired
    private AgendamentoService service;

    @GetMapping
    public List<AgendamentoDTO> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Agendamento buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public void salvar(@Valid @RequestBody AgendamentoDTO agendamentoDTO) {
        service.salvar(agendamentoDTO);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}