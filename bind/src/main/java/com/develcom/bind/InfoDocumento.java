/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.bind;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author develcom
 */
public class InfoDocumento extends Mensages implements Serializable {

    private static final long serialVersionUID = -247361190927599766L;

    private Integer idInfodocumento;
    private String idExpediente;
    private String nombreArchivo;
    private String rutaArchivo;
    private String formato;
    private int numeroDocumento;
    private int version;
    private int paginas;
    private Date fechaVencimiento;
    private Character reDigitalizado;
    private List<DatosInfoDocumento> datosInfodocumentoList;
    private List<Foliatura> foliaturaList;
    private TipoDocumento tipodocumento;
    private EstatusDocumento estatusDocumento;
    private String tipoDocumento;
    private boolean reDigitalizo;
    private String datoAdicional;
    private Character datoAdicionalE;
    private List<DatoAdicional> lsDatosAdicionales;

    public Integer getIdInfodocumento() {
        return idInfodocumento;
    }

    public void setIdInfodocumento(Integer idInfodocumento) {
        this.idInfodocumento = idInfodocumento;
    }

    public String getIdExpediente() {
        return idExpediente;
    }

    public void setIdExpediente(String idExpediente) {
        this.idExpediente = idExpediente;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Character getReDigitalizado() {
        return reDigitalizado;
    }

    public void setReDigitalizado(Character reDigitalizado) {
        this.reDigitalizado = reDigitalizado;
    }

    public List<DatosInfoDocumento> getDatosInfodocumentoList() {
        return datosInfodocumentoList;
    }

    public void setDatosInfodocumentoList(List<DatosInfoDocumento> datosInfodocumentoList) {
        this.datosInfodocumentoList = datosInfodocumentoList;
    }

    public List<Foliatura> getFoliaturaList() {
        return foliaturaList;
    }

    public void setFoliaturaList(List<Foliatura> foliaturaList) {
        this.foliaturaList = foliaturaList;
    }

    public TipoDocumento getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(TipoDocumento tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

//    public TipoDocumento getIdDocumento() {
//        return tipodocumento;
//    }
//
//    public void setIdDocumento(TipoDocumento idDocumento) {
//        this.tipodocumento = idDocumento;
//    }

    public EstatusDocumento getEstatusDocumento() {
        return estatusDocumento;
    }

    public void setEstatusDocumento(EstatusDocumento estatusDocumento) {
        this.estatusDocumento = estatusDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public boolean isReDigitalizo() {
        return reDigitalizo;
    }

    public void setReDigitalizo(boolean reDigitalizo) {
        this.reDigitalizo = reDigitalizo;
    }

    public String getDatoAdicional() {
        return datoAdicional;
    }

    public void setDatoAdicional(String datoAdicional) {
        this.datoAdicional = datoAdicional;
    }

    public List<DatoAdicional> getLsDatosAdicionales() {
        return lsDatosAdicionales;
    }

    public void setLsDatosAdicionales(List<DatoAdicional> lsDatosAdicionales) {
        this.lsDatosAdicionales = lsDatosAdicionales;
    }

    public Character getDatoAdicionalE() {
        return datoAdicionalE;
    }

    public void setDatoAdicionalE(Character datoAdicionalE) {
        this.datoAdicionalE = datoAdicionalE;
    }
}
