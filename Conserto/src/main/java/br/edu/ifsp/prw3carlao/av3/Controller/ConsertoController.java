package br.edu.ifsp.prw3carlao.av3.Controller;

import br.edu.ifsp.prw3carlao.av3.Conserto.Conserto;
import br.edu.ifsp.prw3carlao.av3.Conserto.ConsertoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/consertos")
public class ConsertoController {

    @Autowired
    private ConsertoRepository consertoRepository;

    @PostMapping
    @Transactional
    public Conserto cadastrar(@RequestBody Conserto conserto) {
        return consertoRepository.save(conserto);
    }
}