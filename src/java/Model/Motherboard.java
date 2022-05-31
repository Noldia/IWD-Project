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
public class Motherboard extends ComputerComponent{
    private String      str_cod;
    private String      str_motherboard;
    private Integer     int_gama;
    private Integer     int_tamanio;
    private Integer     int_tipoUso;

    public Motherboard(String str_cod, String str_motherboard, Integer int_gama, Integer int_tamanio, Integer int_tipoUso) {
        this.str_cod = str_cod;
        this.str_motherboard = str_motherboard;
        this.int_gama = int_gama;
        this.int_tamanio = int_tamanio;
        this.int_tipoUso = int_tipoUso;
    }

    public String getStr_cod() {
        return str_cod;
    }

    public void setStr_cod(String str_cod) {
        this.str_cod = str_cod;
    }

    public String getStr_motherboard() {
        return str_motherboard;
    }

    public void setStr_motherboard(String str_motherboard) {
        this.str_motherboard = str_motherboard;
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

    public Integer getInt_tipoUso() {
        return int_tipoUso;
    }

    public void setInt_tipoUso(Integer int_tipoUso) {
        this.int_tipoUso = int_tipoUso;
    }
    
    
    
    
}
