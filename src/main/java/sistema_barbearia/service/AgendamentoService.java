package sistema_barbearia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sistema_barbearia.model.Agendamento;
import sistema_barbearia.repository.AgendamentoRepository;

import java.util.List;

@Service
public class AgendamentoService {

    @Autowired
    private AgendamentoRepository repository;

    public List<Agendamento> listarTodos() {
        return repository.findAll();
    }

    public void salvar(Agendamento agendamento) {
        repository.save(agendamento);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }

    // Essencial para a Edição:
    public Agendamento buscarPorId(Long id) {
        return repository.findById(id).get();
    }
}