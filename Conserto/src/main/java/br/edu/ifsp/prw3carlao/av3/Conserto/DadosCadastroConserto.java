package br.edu.ifsp.prw3carlao.av3.Conserto;

import br.edu.ifsp.prw3carlao.av3.Mecanico.DadosMecanico;
import br.edu.ifsp.prw3carlao.av3.Veiculo.DadosCadastroVeiculo;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroConserto(
        @Pattern(regexp = "\\d{2}/\\d{2}/\\d{4}")
        @NotBlank
        String dataEntrada,

        @Pattern(regexp = "\\d{2}/\\d{2}/\\d{4}")
        @NotBlank
        String dataSaida,

        @Valid
        @NotNull
        DadosCadastroVeiculo veiculo,

        @Valid
        @NotNull
        DadosMecanico mecanico) {
}