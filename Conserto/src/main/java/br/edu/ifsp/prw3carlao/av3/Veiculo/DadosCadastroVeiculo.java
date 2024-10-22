package br.edu.ifsp.prw3carlao.av3.Veiculo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroVeiculo(
        @NotBlank
        String marca,

        @NotBlank
        String modelo,

        @Pattern(regexp = "\\d{4}")
        @NotBlank
        String ano,

        String cor) {
}
