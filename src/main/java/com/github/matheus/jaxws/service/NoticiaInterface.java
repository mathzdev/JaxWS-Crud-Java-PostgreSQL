package com.github.matheus.jaxws.service;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.github.matheus.jaxws.entity.Noticia;

/**
 * Interface de implementacao do WBS Noticia
 */
@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface NoticiaInterface {
    @WebMethod
    boolean criar(Noticia noticia);

    @WebMethod
    boolean alterar(Noticia noticia);

    @WebMethod
    boolean deletar(Noticia noticia);

    @WebMethod
    Noticia ler(int id);

    @WebMethod
    ArrayList<Noticia> pesquisar(String texto);

    @WebMethod
    ArrayList<Noticia> listar();
}