/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.bind;

import java.io.Serializable;

/**
 *
 * @author familia
 */
public class Foliatura extends Mensages implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private Integer idFoliatura;
    private String idExpediente;
    private int pagina;
    private Integer idInfodocumento;
    private Integer idDocumento;
//    private TipoDocumento idDocumento;
//    private InfoDocumento idInfodocumento;

    public Integer getIdFoliatura() {
        return idFoliatura;
    }

    public void setIdFoliatura(Integer idFoliatura) {
        this.idFoliatura = idFoliatura;
    }

    public String getIdExpediente() {
        return idExpediente;
    }

    public void setIdExpediente(String idExpediente) {
        this.idExpediente = idExpediente;
    }

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

//    public TipoDocumento getIdDocumento() {
//        return idDocumento;
//    }
//
//    public void setIdDocumento(TipoDocumento idDocumento) {
//        this.idDocumento = idDocumento;
//    }
//
//    public InfoDocumento getIdInfodocumento() {
//        return idInfodocumento;
//    }
//
//    public void setIdInfodocumento(InfoDocumento idInfodocumento) {
//        this.idInfodocumento = idInfodocumento;
//    }

    public Integer getIdInfodocumento() {
        return idInfodocumento;
    }

    public void setIdInfodocumento(Integer idInfodocumento) {
        this.idInfodocumento = idInfodocumento;
    }

    public Integer getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(Integer idDocumento) {
        this.idDocumento = idDocumento;
    }
}
