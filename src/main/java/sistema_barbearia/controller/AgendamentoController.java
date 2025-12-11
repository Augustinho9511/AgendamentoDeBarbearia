package sistema_barbearia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sistema_barbearia.model.Agendamento;
import sistema_barbearia.service.AgendamentoService;

import java.util.List;

@Controller
@RequestMapping("/agendamento")
public class AgendamentoController {

    @Autowired
    private AgendamentoService service;

    @GetMapping
    public String listarTodos(Model model) {
        List<Agendamento> lista = service.listarTodos();
        model.addAttribute("listaAgendamentos", lista);
        return "lista-agendamento";
    }

    @GetMapping("/novo")
    public String abrirFormulario(Model model) {
        model.addAttribute("agendamento", new Agendamento());
        return "formulario-agendamento";
    }

    @GetMapping("/editar/{id}")
    public String abrirEdicao(@PathVariable Long id, Model model) {
        Agendamento agendamento = service.buscarPorId(id);
        model.addAttribute("agendamento", agendamento);
        return "formulario-agendamento";
    }

    @PostMapping("/salvar")
    public String salvar(Agendamento agendamento) {
        service.salvar(agendamento);
        return "redirect:/agendamento";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id) {
        service.excluir(id);
        return "redirect:/agendamento";
    }
}