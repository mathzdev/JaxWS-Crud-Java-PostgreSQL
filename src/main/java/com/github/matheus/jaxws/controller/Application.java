package com.github.matheus.jaxws.controller;

import com.github.matheus.jaxws.service.NoticiaWBS;

import javax.xml.ws.Endpoint;

/**
 * Classe inicial para liberar o endpoint do WBS
 */
public class Application {
	public static void main(String[] args) {
        /*
         * Endpoint local
         */
		//ligarEndpoint("localhost", "8089");

        /*
         * Endpoint Heroku
         */
        ligarEndpointNoticia("jaxws-crud-java-postgresql.herokuapp.com", "80");
	}

    /**
     * Ligar o endpoint de noticia na url desejada
     * @param dominio
     * @param porta
     */
	private static void ligarEndpointNoticia(String dominio, String porta)
    {
        System.out.println("Liberando WBS na porta: " + porta);
        Endpoint.publish("http://"+ dominio + ":" + porta + "/WBS/NoticiaWBS", new NoticiaWBS());
        System.out.println("Liberado WBS na porta: " + porta);
    }
}
