package com.github.matheus.jaxws.entity;

import java.util.Date;

/**
 * Entidade modelo de dados Noticia
 */
public class Noticia {
	private int id;
	private String titulo;
	private String texto;
	private Date data;	
	
	public Noticia() {
		super();
	}

	public Noticia(String titulo, String texto, Date data) {
		super();
		this.titulo = titulo;
		this.texto = texto;
		this.data = data;
	}
	
	public Noticia(int id, String titulo, String texto, Date data) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.texto = texto;
		this.data = data;
	}

	public Noticia(String titulo, String texto, String data) {
		super();
		this.titulo = titulo;
		this.texto = texto;
		this.data = new Date(data);
	}

	public Noticia(int id, String titulo, String texto, String data) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.texto = texto;
        this.data = new Date(data);
	}

    public Noticia(String titulo, String texto) {
        super();
        this.titulo = titulo;
        this.texto = texto;
        this.data = new Date();
    }
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	} 
}
