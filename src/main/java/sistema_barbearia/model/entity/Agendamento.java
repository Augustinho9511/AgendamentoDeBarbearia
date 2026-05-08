package sistema_barbearia.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate data;

    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime horario;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    public boolean isDataValida() {
        return !this.data.isBefore(java.time.LocalDate.now());
    }
}
