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
public class FiatBuilder extends AutoBuilder{

    @Override
    public void buildMotor() {
        Motor m = new Motor();
        m.setNumero(232323);
        m.setPotencia("23 hp");
    }
    
    @Override
    public void buildMarca() {
        auto.setMarca("fiat");
    }
    
    @Override
    public void buildModelo() {
        auto.setModelo("palio");
    }
    
    @Override
    public void buildPuertas() {
        auto.setCantidaddepuertas(2);
    }
    
}
