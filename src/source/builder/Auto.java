/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source.builder;

/**
 *
 * @author jersonandres
 */
public class Auto implements Cloneable{
    
    private int cantidaddepuertas;
    private Motor motor;
    private String modelo;
    private String marca;

    @Override
    public String toString(){
        return "modelo: "+ this.modelo +" marca:"+this.marca;
    }
    
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    
    public int getCantidaddepuertas() {
        return cantidaddepuertas;
    }

    public void setCantidaddepuertas(int cantidaddepuertas) {
        this.cantidaddepuertas = cantidaddepuertas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
}
