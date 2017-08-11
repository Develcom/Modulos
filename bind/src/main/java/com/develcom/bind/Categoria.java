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
public class Categoria extends Mensages implements Serializable {

    private static final long serialVersionUID = -2822420755000006811L;

    private Integer idCategoria;
    private String categoria;
    private Estatus estatus;
    private List<SubCategoria> subcategoriaList;
    private Libreria libreria;
    private List<TipoDocumento> tipodocumentoList;
    private List<Expedientes> expedientesList;
    private List<Perfil> perfilList;
    private List<Indices> indicesList;

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Estatus getEstatus() {
        return estatus;
    }

    public void setEstatus(Estatus estatus) {
        this.estatus = estatus;
    }

    public Libreria getLibreria() {
        return libreria;
    }

    public void setLibreria(Libreria libreria) {
        this.libreria = libreria;
    }

    public List<SubCategoria> getSubcategoriaList() {
        return subcategoriaList;
    }

    public void setSubcategoriaList(List<SubCategoria> subcategoriaList) {
        this.subcategoriaList = subcategoriaList;
    }

    public List<TipoDocumento> getTipodocumentoList() {
        return tipodocumentoList;
    }

    public void setTipodocumentoList(List<TipoDocumento> tipodocumentoList) {
        this.tipodocumentoList = tipodocumentoList;
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

    public List<Indices> getIndicesList() {
        return indicesList;
    }

    public void setIndicesList(List<Indices> indicesList) {
        this.indicesList = indicesList;
    }
}
