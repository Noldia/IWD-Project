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
public class Mouse {
    private String      str_code;
    private String      str_mouse;
    private Integer     int_tipoUso;
    private Integer     int_gama;
    private Integer     int_tamanio;
    private Integer     int_disenio;
    private float       int_price;

    public Mouse(String str_code, String str_mouse, Integer int_tipoUso, Integer int_gama, Integer int_tamanio, Integer int_disenio, float int_price) {
        this.str_code = str_code;
        this.str_mouse = str_mouse;
        this.int_tipoUso = int_tipoUso;
        this.int_gama = int_gama;
        this.int_tamanio = int_tamanio;
        this.int_disenio = int_disenio;
        this.int_price = int_price;
    }

    public String getStr_code() {
        return str_code;
    }

    public void setStr_code(String str_code) {
        this.str_code = str_code;
    }

    public String getStr_mouse() {
        return str_mouse;
    }

    public void setStr_mouse(String str_mouse) {
        this.str_mouse = str_mouse;
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

    public float getInt_price() {
        return int_price;
    }

    public void setInt_price(float int_price) {
        this.int_price = int_price;
    }
    
    
}
