package br.edu.ifsp.prw3carlao.av3.Mecanico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroMecanico(
        @NotBlank
        String nome,

        @NotNull
        int anosExperiencia) {
}