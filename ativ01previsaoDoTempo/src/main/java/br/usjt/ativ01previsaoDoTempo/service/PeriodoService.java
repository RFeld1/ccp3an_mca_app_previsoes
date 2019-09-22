package br.usjt.ativ01previsaoDoTempo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.ativ01previsaoDoTempo.model.Periodo;
import br.usjt.ativ01previsaoDoTempo.repository.PeriodoRepository;

@Service
public class PeriodoService {
	@Autowired
	private PeriodoRepository periodoRepo;

	public void salvar(Periodo periodo) {
		periodoRepo.save(periodo);
	}

	public List<Periodo> listarTodos() {
		return periodoRepo.findAll();
	}
}
