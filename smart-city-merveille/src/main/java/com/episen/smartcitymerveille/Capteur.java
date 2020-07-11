package com.episen.smartcitymerveille;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Capteur {
	private Long id;
	private String adresse_ip;
	private String localisation;
	private String seuil_co2;
	private String seuil_no2;
	private String seuil_pf;
	private String seuil_min_tmp;
	private String seuil_max_tmp;

protected Capteur() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public String getAdresse_ip() {
		return adresse_ip;
	}

	public void setAdresse_ip(String adresse_ip) {
		this.adresse_ip = adresse_ip;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getSeuil_co2() {
		return seuil_co2;
	}

	public void setSeuil_co2(String seuil_co2) {
		this.seuil_co2 = seuil_co2;
	}

	public String getSeuil_no2() {
		return seuil_no2;
	}

	public void setSeuil_no2(String seuil_no2) {
		this.seuil_no2 = seuil_no2;
	}

	public String getSeuil_pf() {
		return seuil_pf;
	}

	public void setSeuil_pf(String seuil_pf) {
		this.seuil_pf = seuil_pf;
	}

	public String getSeuil_min_tmp() {
		return seuil_min_tmp;
	}

	public void setSeuil_min_tmp(String seuil_min_tmp) {
		this.seuil_min_tmp = seuil_min_tmp;
	}

	public String getSeuil_max_tmp() {
		return seuil_max_tmp;
	}

	public void setSeuil_max_tmp(String seuil_max_tmp) {
		this.seuil_max_tmp = seuil_max_tmp;
	}
	
}
