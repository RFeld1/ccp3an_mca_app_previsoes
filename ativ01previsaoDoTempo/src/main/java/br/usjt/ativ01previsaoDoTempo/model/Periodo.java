package br.usjt.ativ01previsaoDoTempo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Periodo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;

    private String diaSemana;
    private String datahora;
    private int temperaturaMin;
    private int temperaturaMax;
    private int huminade;
    private String latitude;
    private String longitude;
    private String descricao;

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public int getTemperaturaMin() {
        return temperaturaMin;
    }

    public void setTemperaturaMin(int temperaturaMin) {
        this.temperaturaMin = temperaturaMin;
    }

    public int getTemperaturaMax() {
        return temperaturaMax;
    }

    public void setTemperaturaMax(int temperaturaMax) {
        this.temperaturaMax = temperaturaMax;
    }

    public int getHuminade() {
        return huminade;
    }

    public void setHuminade(int huminade) {
        this.huminade = huminade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getDatahora() {
		return datahora;
	}

	public void setDatahora(String datahora) {
		this.datahora = datahora;
	}
}
