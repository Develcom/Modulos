/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.bind;

import java.io.Serializable;
import java.util.List;


public class DatoAdicional<T> extends Mensages implements Serializable {

    private static final long serialVersionUID = 6652097072996225821L;

    private T valor;
    private int idValor;
    private int idDatoAdicional;
    private TipoDocumento tipoDocumento;
    private String indiceAdicional;
    private String tipo;
    private int codigo;
    private int numeroDocumento;
    private int version;
    private List<ValorDatoAdicional> valorDatoAdicionalList;

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public int getIdValor() {
        return idValor;
    }

    public void setIdValor(int idValor) {
        this.idValor = idValor;
    }

    public int getIdDatoAdicional() {
        return idDatoAdicional;
    }

    public void setIdDatoAdicional(int idDatoAdicional) {
        this.idDatoAdicional = idDatoAdicional;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getIndiceAdicional() {
        return indiceAdicional;
    }

    public void setIndiceAdicional(String indiceAdicional) {
        this.indiceAdicional = indiceAdicional;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public List<ValorDatoAdicional> getValorDatoAdicionalList() {
        return valorDatoAdicionalList;
    }

    public void setValorDatoAdicionalList(List<ValorDatoAdicional> valorDatoAdicionalList) {
        this.valorDatoAdicionalList = valorDatoAdicionalList;
    }
}
