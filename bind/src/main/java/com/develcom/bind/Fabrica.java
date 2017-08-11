/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.develcom.bind;

import java.io.Serializable;

/**
 *
 * @author develcom
 */
public class Fabrica extends Mensages implements Serializable {

    private static final long serialVersionUID = -3919673669390398297L;

    private int idFabrica;
    private Character fabrica;
    private Usuario usuario1;

    public int getIdFabrica() {
        return idFabrica;
    }

    public void setIdFabrica(int idFabrica) {
        this.idFabrica = idFabrica;
    }

    public Character getFabrica() {
        return fabrica;
    }

    public void setFabrica(Character fabrica) {
        this.fabrica = fabrica;
    }

    public Usuario getUsuario1() {
        return usuario1;
    }

    public void setUsuario1(Usuario usuario) {
        this.usuario1 = usuario;
    }
}
