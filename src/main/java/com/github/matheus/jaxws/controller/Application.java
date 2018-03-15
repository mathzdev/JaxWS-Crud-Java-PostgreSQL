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
        ligarEndpointNoticia("http","localhost", "8089");
	}

    /**
     * Ligar o endpoint de noticia na url desejada
     * @param protocolo
     * @param dominio
     * @param porta
     */
	private static void ligarEndpointNoticia(String protocolo, String dominio, String porta)
    {
        System.out.println("Liberando WBS na porta: " + porta);
        Endpoint.publish(protocolo + "://" + dominio + ":" + porta + "/WBS/NoticiaWBS", new NoticiaWBS());
        System.out.println("Liberado WBS na porta: " + porta);
    }
}
