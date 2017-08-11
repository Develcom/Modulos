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
public class TipoDocumento extends Mensages implements Serializable {

    private static final long serialVersionUID = -2262850499910203728L;
    private int idDocumento;
    private String tipoDocumento;
    private Categoria idCategoria;
    private SubCategoria idSubcategoria;
    private Estatus idEstatus;
    private String vencimiento;
    private String datoAdicional;
    private String ficha;
    private List<DatoAdicional> datoAdicionalList;
    private List<Foliatura> foliaturaList;
    private List<InfoDocumento> infodocumentoList;

    public Categoria getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Categoria idCategoria) {
        this.idCategoria = idCategoria;
    }

    public SubCategoria getIdSubcategoria() {
        return idSubcategoria;
    }

    public void setIdSubcategoria(SubCategoria idSubcategoria) {
        this.idSubcategoria = idSubcategoria;
    }

    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Estatus getIdEstatus() {
        return idEstatus;
    }

    public void setIdEstatus(Estatus idEstatus) {
        this.idEstatus = idEstatus;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getDatoAdicional() {
        return datoAdicional;
    }

    public void setDatoAdicional(String datoAdicional) {
        this.datoAdicional = datoAdicional;
    }

    public String getFicha() {
        return ficha;
    }

    public void setFicha(String ficha) {
        this.ficha = ficha;
    }

    public List<DatoAdicional> getDatoAdicionalList() {
        return datoAdicionalList;
    }

    public void setDatoAdicionalList(List<DatoAdicional> datoAdicionalList) {
        this.datoAdicionalList = datoAdicionalList;
    }

    public List<Foliatura> getFoliaturaList() {
        return foliaturaList;
    }

    public void setFoliaturaList(List<Foliatura> foliaturaList) {
        this.foliaturaList = foliaturaList;
    }

    public List<InfoDocumento> getInfodocumentoList() {
        return infodocumentoList;
    }

    public void setInfodocumentoList(List<InfoDocumento> infodocumentoList) {
        this.infodocumentoList = infodocumentoList;
    }
}
