package br.edu.ifsp.prw3carlao.av3.Conserto;

import br.edu.ifsp.prw3carlao.av3.Mecanico.DadosCadastroMecanico;
import br.edu.ifsp.prw3carlao.av3.Veiculo.DadosCadastroVeiculo;

public record DadosCadastroConserto(String dataEntrada, String dataSaida,
                                    DadosCadastroVeiculo veiculo,
                                    DadosCadastroMecanico mecanico) {
}