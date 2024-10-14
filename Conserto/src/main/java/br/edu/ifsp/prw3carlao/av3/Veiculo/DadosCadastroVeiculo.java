package br.edu.ifsp.prw3carlao.av3.Veiculo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroVeiculo(
        @NotBlank
        @NotNull
        String marca,

        @NotBlank
        @NotNull
        String modelo,

        @Pattern(regexp = "\\d{4}")
        @NotBlank
        @NotNull
        String ano,

        String cor) {
}
