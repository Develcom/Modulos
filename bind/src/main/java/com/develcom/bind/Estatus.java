/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.bind;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author SoaintWin64HP
 */
public class Estatus extends Mensages implements Serializable {

    private static final long serialVersionUID = 1L;

    private int idEstatus;
    private String estatus;
    private List<Usuario> usuarioList;
    private List<Categoria> categoriaEntidadList;
    private List<Libreria> libreriaEntidadList;
    private List<TipoDocumento> tipoDocumentoEntidadList;
    private List<SubCategoria> subCategoriaEntidadList;

    public int getIdEstatus() {
        return idEstatus;
    }

    public void setIdEstatus(int idEstatus) {
        this.idEstatus = idEstatus;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    public List<Categoria> getCategoriaEntidadList() {
        return categoriaEntidadList;
    }

    public void setCategoriaEntidadList(List<Categoria> categoriaEntidadList) {
        this.categoriaEntidadList = categoriaEntidadList;
    }

    public List<Libreria> getLibreriaEntidadList() {
        return libreriaEntidadList;
    }

    public void setLibreriaEntidadList(List<Libreria> libreriaEntidadList) {
        this.libreriaEntidadList = libreriaEntidadList;
    }

    public List<TipoDocumento> getTipoDocumentoEntidadList() {
        return tipoDocumentoEntidadList;
    }

    public void setTipoDocumentoEntidadList(List<TipoDocumento> tipoDocumentoEntidadList) {
        this.tipoDocumentoEntidadList = tipoDocumentoEntidadList;
    }

    public List<SubCategoria> getSubCategoriaEntidadList() {
        return subCategoriaEntidadList;
    }

    public void setSubCategoriaEntidadList(List<SubCategoria> subCategoriaEntidadList) {
        this.subCategoriaEntidadList = subCategoriaEntidadList;
    }
}
