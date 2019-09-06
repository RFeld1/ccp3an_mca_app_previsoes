package br.usjt.ativ01previsaoDoTempo.repository;

import br.usjt.ativ01previsaoDoTempo.model.Periodo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeriodoRepository extends JpaRepository<Periodo, Long> {

}