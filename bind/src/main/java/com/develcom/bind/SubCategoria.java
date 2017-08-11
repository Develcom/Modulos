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
public class SubCategoria extends Mensages implements Serializable {

    private static final long serialVersionUID = -2386561446106085517L;

    private int idSubcategoria;
    private Categoria idCategoria;
    private String subcategoria;
    private Estatus idEstatus;
    private List<TipoDocumento> tipodocumentoList;

    public String getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(String subcategoria) {
        this.subcategoria = subcategoria;
    }

    public Categoria getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Categoria idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdSubcategoria() {
        return idSubcategoria;
    }

    public void setIdSubcategoria(int idSubcategoria) {
        this.idSubcategoria = idSubcategoria;
    }

    public List<TipoDocumento> getTipodocumentoList() {
        return tipodocumentoList;
    }

    public void setTipodocumentoList(List<TipoDocumento> tipodocumentoList) {
        this.tipodocumentoList = tipodocumentoList;
    }

    public Estatus getIdEstatus() {
        return idEstatus;
    }

    public void setIdEstatus(Estatus idEstatus) {
        this.idEstatus = idEstatus;
    }
}
