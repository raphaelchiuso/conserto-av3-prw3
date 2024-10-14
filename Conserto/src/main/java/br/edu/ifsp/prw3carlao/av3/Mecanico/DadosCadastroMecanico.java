package br.edu.ifsp.prw3carlao.av3.Mecanico;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroMecanico(
        @NotBlank
        String nome,

        @NotBlank
        int anosExperiencia) {
}