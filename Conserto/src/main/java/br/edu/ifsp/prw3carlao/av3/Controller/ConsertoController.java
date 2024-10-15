package br.edu.ifsp.prw3carlao.av3.Controller;

import br.edu.ifsp.prw3carlao.av3.Conserto.Conserto;
import br.edu.ifsp.prw3carlao.av3.Conserto.ConsertoRepository;
import br.edu.ifsp.prw3carlao.av3.Conserto.DadosCadastroConserto;
import br.edu.ifsp.prw3carlao.av3.Conserto.DadosListagemConserto;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/consertos")
public class ConsertoController {

    @Autowired
    private ConsertoRepository consertoRepository;

    @PostMapping
    @Transactional
    public Conserto cadastrar(@RequestBody @Valid DadosCadastroConserto dadosCadastroConserto) {
        return consertoRepository.save(new Conserto(dadosCadastroConserto));
    }

    @GetMapping
    public List<Conserto> listar() {
        return consertoRepository.findAll();
    }

    @GetMapping("/algunsdados")
    public Page<DadosListagemConserto> listarAlgunsDados(Pageable paginacao) {
        return consertoRepository.findAll(paginacao).map(DadosListagemConserto::new);
    }
}