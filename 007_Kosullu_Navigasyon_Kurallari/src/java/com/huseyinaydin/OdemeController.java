/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huseyinaydin;

import java.io.Serializable;

/**
 *
 * @author husey
 */
public class OdemeController implements Serializable{

    /**
     * Creates a new instance of OdemeController
     */
    private static final long serialVersionUID = 1L;
    public boolean siparisOnayi = true;
    public int siparisToplam = 50;
    public OdemeController() {
    }

    public boolean isSiparisOnayi() {
        return siparisOnayi;
    }

    public void setSiparisOnayi(boolean siparisOnayi) {
        this.siparisOnayi = siparisOnayi;
    }

    public int getSiparisToplam() {
        return siparisToplam;
    }

    public void setSiparisToplam(int siparisToplam) {
        this.siparisToplam = siparisToplam;
    }
    
    public String odemeAc(){
        siparisToplam = this.getSiparisToplam();
        return "odeme";
    }
    
    public String siparisAc(){
        return "siparis";
    }
    public String urunlerAc(){
        return "urunler";
    }
    public String uyeolAc(){
        return "uyeol";
    }
}
