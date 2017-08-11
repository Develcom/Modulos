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
 * @author familia
 */
public class EstatusDocumento extends Mensages implements Serializable{
    
    private Integer idEstatusDocumento;
    private String estatusDocumento;
    private List<InfoDocumento> infodocumentoList;

    public Integer getIdEstatusDocumento() {
        return idEstatusDocumento;
    }

    public void setIdEstatusDocumento(Integer idEstatusDocumento) {
        this.idEstatusDocumento = idEstatusDocumento;
    }

    public String getEstatusDocumento() {
        return estatusDocumento;
    }

    public void setEstatusDocumento(String estatusDocumento) {
        this.estatusDocumento = estatusDocumento;
    }

    public List<InfoDocumento> getInfodocumentoList() {
        return infodocumentoList;
    }

    public void setInfodocumentoList(List<InfoDocumento> infodocumentoList) {
        this.infodocumentoList = infodocumentoList;
    }
}
