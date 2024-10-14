package br.edu.ifsp.prw3carlao.av3.Conserto;

public record DadosListagemConserto(
        String dataEntrada,
        String dataSaida,
        String mecanicoNome,
        String veiculoMarca,
        String veiculoModelo) {

    public DadosListagemConserto(Conserto conserto) {
        this(
                conserto.getDataEntrada(),
                conserto.getDataSaida(),
                conserto.getMecanico().getNome(),
                conserto.getVeiculo().getMarca(),
                conserto.getVeiculo().getModelo());
    }
}
