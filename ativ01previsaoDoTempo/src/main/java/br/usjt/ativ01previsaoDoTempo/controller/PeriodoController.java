package br.usjt.ativ01previsaoDoTempo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.ativ01previsaoDoTempo.model.Periodo;
import br.usjt.ativ01previsaoDoTempo.repository.PeriodoRepository;
import java.util.List;

@Controller
public class PeriodoController {

    //a injeção de dependência ocorre aqui
    @Autowired
    private PeriodoRepository periodoRepo;

    @GetMapping("/previsao")
    public ModelAndView listarPrevisao() {
        //passe o nome da página ao construtor
        ModelAndView mv = new ModelAndView("lista_previsao");

        //Busque a coleção com o repositório
        List<Periodo> periodos = periodoRepo.findAll();

        //adicione a coleção ao objeto ModelAndView
        mv.addObject("periodos", periodos);

        //para modelar o formulário
        mv.addObject(new Periodo());

        //devolva o ModelAndView
        return mv;
    }
}


