package br.usjt.ativ01previsaoDoTempo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.ativ01previsaoDoTempo.model.Usuario;
import br.usjt.ativ01previsaoDoTempo.service.LoginService;



@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;

	@GetMapping(value = { "/login", "/" })
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("login");
		mv.addObject(new Usuario());
		return mv;
	}

	@PostMapping("/fazerLogin")
	public String fazerLogin(HttpServletRequest request, Usuario usuario) {
		if (loginService.logar(usuario)) {
			request.getSession().setAttribute("usuarioLogado", usuario);
			return "redirect:previsao";
		} else {
			return "login";
		}
	}
}
