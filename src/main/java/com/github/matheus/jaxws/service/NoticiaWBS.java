package com.github.matheus.jaxws.service;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.jws.WebService;

import com.github.matheus.jaxws.dao.NoticiaDao;
import com.github.matheus.jaxws.entity.Noticia;

/**
 * Endpoint com os metodos do WBS Noticia
 */
@WebService(endpointInterface = "com.github.matheus.jaxws.service.NoticiaInterface")
public class NoticiaWBS implements NoticiaInterface {
    public boolean criar(Noticia noticia) {
        NoticiaDao dao = new NoticiaDao();
        try {
            return dao.criar(noticia);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean alterar(Noticia noticia) {
        NoticiaDao dao = new NoticiaDao();
        try {
            return dao.alterar(noticia);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deletar(Noticia noticia) {
        NoticiaDao dao = new NoticiaDao();
        try {
            return dao.deletar(noticia);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Noticia ler(int id) {
        NoticiaDao dao = new NoticiaDao();
        try {
            return dao.ler(id);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<Noticia> pesquisar(String texto) {
        NoticiaDao dao = new NoticiaDao();
        try {
            return dao.pesquisar(texto);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<Noticia> listar() {
        NoticiaDao dao = new NoticiaDao();
        try {
            return dao.listar();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}