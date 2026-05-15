package sistema_barbearia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sistema_barbearia.exception.AgendamentoNaoEncontradoException;
import sistema_barbearia.model.DTO.ClienteDTO;
import sistema_barbearia.model.DTO.DashboardDTO;
import sistema_barbearia.model.entity.Agendamento;
import sistema_barbearia.model.DTO.AgendamentoDTO;
import sistema_barbearia.model.entity.Cliente;
import sistema_barbearia.repository.AgendamentoRepository;
import sistema_barbearia.repository.ClienteRepository;

import java.util.List;

@Service
public class AgendamentoService {

    @Autowired
    private AgendamentoRepository repository;

    @Autowired
    private ClienteRepository clienteRepository;

    public List<AgendamentoDTO> listarTodos() {
        List<Agendamento> agendamentos = repository.findAll();

        return agendamentos.stream()
                .map(a -> {
                    AgendamentoDTO dto = new AgendamentoDTO();
                    dto.setData(a.getData());
                    dto.setHorario(a.getHorario());

                    if (a.getCliente() != null) {
                        ClienteDTO clienteDTO = new ClienteDTO();
                        clienteDTO.setNome(a.getCliente().getNome());
                        clienteDTO.setTelefone(a.getCliente().getTelefone());
                        clienteDTO.setEmail(a.getCliente().getEmail());
                        dto.setCliente(clienteDTO);
                    }

                    return dto;
                })
                .toList();
    }

    public void salvar(AgendamentoDTO dto) {
        Cliente cliente = new Cliente();
        cliente.setNome(dto.getCliente().getNome());
        cliente.setTelefone(dto.getCliente().getTelefone());
        cliente.setEmail(dto.getCliente().getEmail());

        cliente = clienteRepository.save(cliente);

        Agendamento agendamento = new Agendamento();
        agendamento.setData(dto.getData());
        agendamento.setHorario(dto.getHorario());

        repository.save(agendamento);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }

    public Agendamento buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new AgendamentoNaoEncontradoException ("Ops! O agendamento com ID "+ id +" não existe na Baarbearia."));
    }

    public DashboardDTO gerarDashboard() {
        DashboardDTO dashboard = new DashboardDTO();

        dashboard.setTotalAgendamento(repository.contarTotalAgendamentos());
        dashboard.setFaturamentoTotal(repository.somarFaturamentoTotal());
        dashboard.setTicketMedio(repository.calcularTicketMedio());

        if (dashboard.getFaturamentoTotal() == null) {
            dashboard.setFaturamentoTotal(0.0);
            dashboard.setTicketMedio(0.0);
        }

        return dashboard;
    }
}
