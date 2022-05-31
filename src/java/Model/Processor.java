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
public class Processor{
    
    private String      str_cod;
    private String      str_processor;
    private Integer     int_gama;
    private Integer     int_tipoUso;
    private float       flt_price;

    public Processor(String str_cod, String str_processor, Integer int_gama, Integer int_tipoUso, float flt_price) {
        this.str_cod = str_cod;
        this.str_processor = str_processor;
        this.int_gama = int_gama;
        this.int_tipoUso = int_tipoUso;
        this.flt_price = flt_price;
    }

    public String getStr_cod() {
        return str_cod;
    }

    public void setStr_cod(String str_cod) {
        this.str_cod = str_cod;
    }

    public String getStr_processor() {
        return str_processor;
    }

    public void setStr_processor(String str_processor) {
        this.str_processor = str_processor;
    }

    public Integer getInt_gama() {
        return int_gama;
    }

    public void setInt_gama(Integer int_gama) {
        this.int_gama = int_gama;
    }

    public Integer getInt_tipoUso() {
        return int_tipoUso;
    }

    public void setInt_tipoUso(Integer int_tipoUso) {
        this.int_tipoUso = int_tipoUso;
    }

   public float getFlt_price() {
        return flt_price;
    }

    public void setFlt_price(float flt_price) {
        this.flt_price = flt_price;
    }
 
}
