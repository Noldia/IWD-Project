/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ivar29
 */
public class Monitor {
    
    private String      str_code;
    private String      str_monitor;
    private Integer     int_tipoUso;
    private Integer     int_gama;
    private Integer     int_tamanio;
    private Integer     int_disenio;
    private float       flt_price;

    public Monitor(String str_code, String str_monitor, Integer int_tipoUso, Integer int_gama, Integer int_tamanio, Integer int_disenio, float flt_price) {
        this.str_code = str_code;
        this.str_monitor = str_monitor;
        this.int_tipoUso = int_tipoUso;
        this.int_gama = int_gama;
        this.int_tamanio = int_tamanio;
        this.int_disenio = int_disenio;
        this.flt_price = flt_price;
    }

    public String getStr_code() {
        return str_code;
    }

    public void setStr_code(String str_code) {
        this.str_code = str_code;
    }

    public String getStr_monitor() {
        return str_monitor;
    }

    public void setStr_monitor(String str_monitor) {
        this.str_monitor = str_monitor;
    }

    public Integer getInt_tipoUso() {
        return int_tipoUso;
    }

    public void setInt_tipoUso(Integer int_tipoUso) {
        this.int_tipoUso = int_tipoUso;
    }

    public Integer getInt_gama() {
        return int_gama;
    }

    public void setInt_gama(Integer int_gama) {
        this.int_gama = int_gama;
    }

    public Integer getInt_tamanio() {
        return int_tamanio;
    }

    public void setInt_tamanio(Integer int_tamanio) {
        this.int_tamanio = int_tamanio;
    }

    public Integer getInt_disenio() {
        return int_disenio;
    }

    public void setInt_disenio(Integer int_disenio) {
        this.int_disenio = int_disenio;
    }

    public float getFlt_price() {
        return flt_price;
    }

    public void setFlt_price(float flt_price) {
        this.flt_price = flt_price;
    }
    
    
    
}
