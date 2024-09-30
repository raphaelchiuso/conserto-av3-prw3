package br.edu.ifsp.prw3carlao.av3.Mecanico;

import jakarta.persistence.*;
import lombok.*;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Mecanico {

    private String nome;
    private int anosExperiencia;

    public Mecanico(DadosCadastroMecanico dados) {
        this.nome = dados.nome();
        this.anosExperiencia = dados.anosExperiencia();
    }
}
