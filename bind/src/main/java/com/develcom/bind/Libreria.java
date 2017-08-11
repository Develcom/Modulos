/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.bind;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author develcom
 */
public class Libreria extends Mensages implements Serializable {

    private static final long serialVersionUID = 2428823359479157938L;

    private String libreria;
    private int idLibreria;
    private Integer idEstatus;
//    private Estatus idEstatus;
    private List<Categoria> categoriaList;
    private List<Expedientes> expedientesList;
    private List<Perfil> perfilList;

    public String getLibreria() {
        return libreria;
    }

    public void setLibreria(String libreria) {
        this.libreria = libreria;
    }

    public int getIdLibreria() {
        return idLibreria;
    }

    public void setIdLibreria(int idLibreria) {
        this.idLibreria = idLibreria;
    }

    public Integer getIdEstatus() {
        return idEstatus;
    }

    public void setIdEstatus(Integer idEstatus) {
        this.idEstatus = idEstatus;
    }

//    public Estatus getIdEstatus() {
//        return idEstatus;
//    }
//
//    public void setIdEstatus(Estatus idEstatus) {
//        this.idEstatus = idEstatus;
//    }

    public List<Categoria> getCategoriaList() {
        return categoriaList;
    }

    public void setCategoriaList(List<Categoria> categoriaList) {
        this.categoriaList = categoriaList;
    }

    public List<Expedientes> getExpedientesList() {
        return expedientesList;
    }

    public void setExpedientesList(List<Expedientes> expedientesList) {
        this.expedientesList = expedientesList;
    }

    public List<Perfil> getPerfilList() {
        return perfilList;
    }

    public void setPerfilList(List<Perfil> perfilList) {
        this.perfilList = perfilList;
    }
}
