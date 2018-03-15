package com.github.matheus.jaxws.controller;

import com.github.matheus.jaxws.service.NoticiaWBS;

import javax.xml.ws.Endpoint;

/**
 * Classe inicial para liberar o endpoint do WBS
 */
public class Application {
	public static void main(String[] args) {
		String porta = "8089";
		System.out.println("Liberando WBS na porta: " + porta);
		Endpoint.publish("http://localhost:" + porta + "/WBS/NoticiaWBS", new NoticiaWBS());
		System.out.println("Liberado WBS na porta: " + porta);
	}
}
