package br.edu.ifsp.prw3carlao.av3.Conserto;

import br.edu.ifsp.prw3carlao.av3.Mecanico.DadosMecanico;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoConserto (
        @NotNull
        Long id,

        String dataSaida,

        DadosMecanico mecanico) { }
