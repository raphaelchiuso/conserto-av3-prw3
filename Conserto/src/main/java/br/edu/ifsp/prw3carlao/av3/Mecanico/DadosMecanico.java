package br.edu.ifsp.prw3carlao.av3.Mecanico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosMecanico(
        @NotBlank
        String nome,

        @NotNull
        Integer anosExperiencia) {
}