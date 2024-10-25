package br.edu.ifsp.prw3carlao.av3.Conserto;

import br.edu.ifsp.prw3carlao.av3.Mecanico.Mecanico;
import br.edu.ifsp.prw3carlao.av3.Veiculo.Veiculo;

public record DadosDetalhamentoConserto(Long id, String dataEntrada, String dadaSaida,
                                        Veiculo veiculo, Mecanico mecanico) {
    public DadosDetalhamentoConserto(Conserto conserto){
        this(conserto.getId(),
                conserto.getDataEntrada(),
                conserto.getDataSaida(),
                conserto.getVeiculo(),
                conserto.getMecanico());
    }
}
