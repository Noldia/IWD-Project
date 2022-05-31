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
public class PowerSupply {
    
    private String      str_cod;
    private String      str_powerSupply;
    private Integer     int_tipoUso;
    private Integer     int_gama;
    private Integer     int_tamanio;
    private Integer     int_disenio;
    private float       flt_price;

    public PowerSupply(String str_cod, String str_powerSupply, Integer int_tipoUso, Integer int_gama, Integer int_tamanio, Integer int_disenio, float flt_price) {
        this.str_cod = str_cod;
        this.str_powerSupply = str_powerSupply;
        this.int_tipoUso = int_tipoUso;
        this.int_gama = int_gama;
        this.int_tamanio = int_tamanio;
        this.int_disenio = int_disenio;
        this.flt_price = flt_price;
    }

    public String getStr_cod() {
        return str_cod;
    }

    public void setStr_cod(String str_cod) {
        this.str_cod = str_cod;
    }

    public String getStr_powerSupply() {
        return str_powerSupply;
    }

    public void setStr_powerSupply(String str_powerSupply) {
        this.str_powerSupply = str_powerSupply;
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
