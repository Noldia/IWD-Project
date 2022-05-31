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
public class ComputerComponent {
    private String      str_code;
    private String      str_brand;
    private String      str_serie;
    private String      str_model;
    private float       flt_price;
    private int         int_tipoUso;
    private int         int_gama;
    private int         int_tamano;
    private int         int_diseno;

    public ComputerComponent(String str_code, String str_brand, String str_serie, String str_model, float flt_price, int int_tipoUso, int int_gama, int int_tamano, int int_diseno) {
        this.str_code = str_code;
        this.str_brand = str_brand;
        this.str_serie = str_serie;
        this.str_model = str_model;
        this.flt_price = flt_price;
        this.int_tipoUso = int_tipoUso;
        this.int_gama = int_gama;
        this.int_tamano = int_tamano;
        this.int_diseno = int_diseno;
    }

    public String getStr_code() {
        return str_code;
    }

    public void setStr_code(String str_code) {
        this.str_code = str_code;
    }

    public String getStr_brand() {
        return str_brand;
    }

    public void setStr_brand(String str_brand) {
        this.str_brand = str_brand;
    }

    public String getStr_serie() {
        return str_serie;
    }

    public void setStr_serie(String str_serie) {
        this.str_serie = str_serie;
    }

    public String getStr_model() {
        return str_model;
    }

    public void setStr_model(String str_model) {
        this.str_model = str_model;
    }

    public float getFlt_price() {
        return flt_price;
    }

    public void setFlt_price(float flt_price) {
        this.flt_price = flt_price;
    }

    public int getInt_tipoUso() {
        return int_tipoUso;
    }

    public void setInt_tipoUso(int int_tipoUso) {
        this.int_tipoUso = int_tipoUso;
    }

    public int getInt_gama() {
        return int_gama;
    }

    public void setInt_gama(int int_gama) {
        this.int_gama = int_gama;
    }

    public int getInt_tamano() {
        return int_tamano;
    }

    public void setInt_tamano(int int_tamano) {
        this.int_tamano = int_tamano;
    }

    public int getInt_diseno() {
        return int_diseno;
    }

    public void setInt_diseno(int int_diseno) {
        this.int_diseno = int_diseno;
    }
    
    
    
}
