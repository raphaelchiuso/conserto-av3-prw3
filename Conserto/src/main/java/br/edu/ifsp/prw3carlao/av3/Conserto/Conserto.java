package br.edu.ifsp.prw3carlao.av3.Conserto;

import br.edu.ifsp.prw3carlao.av3.Mecanico.Mecanico;
import br.edu.ifsp.prw3carlao.av3.Veiculo.Veiculo;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "consertos")
@Entity(name = "Conserto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Conserto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String dataEntrada;
    private String dataSaida;

    @Embedded
    private Veiculo veiculo;

    @Embedded
    private Mecanico mecanico;

    public Conserto(DadosCadastroConserto dados) {
        this.dataEntrada = dados.dataEntrada();
        this.dataSaida = dados.dataSaida();
        this.veiculo = new Veiculo(dados.veiculo());
        this.mecanico = new Mecanico(dados.mecanico());
    }
}
