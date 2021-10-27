package com.calendario_siembra.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Parcela implements Serializable {
	
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;
	
	@Column
	private String nombre;
	
	@Column
	private Integer tamanioParcela;
	
	@Column
	private String provincia;
	
	@Column
	@OneToMany
	private List <Planta> listaPlantas;

	public Parcela(String id, String nombre, Integer tamanioParcela, String provincia, List<Planta> listaPlantas) {
		this.id = id;
		this.nombre = nombre;
		this.tamanioParcela = tamanioParcela;
		this.provincia = provincia;
		this.listaPlantas = listaPlantas;
	}

	public Parcela() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getTamanioParcela() {
		return tamanioParcela;
	}

	public void setTamanioParcela(Integer tamanioParcela) {
		this.tamanioParcela = tamanioParcela;
	}

        public String getProvincia() {
            return provincia;
        }

        public void setProvincia(String provincia) {
            this.provincia = provincia;
        }


	public List<Planta> getListaPlantas() {
		return listaPlantas;
	}

	public void setListaPlantas(List<Planta> listaPlantas) {
		this.listaPlantas = listaPlantas;
	}
	
	
	
	

}
