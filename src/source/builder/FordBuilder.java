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
public class FordBuilder extends AutoBuilder {

    @Override
    public void buildMotor() {
        Motor m = new Motor();
        m.setNumero(212121);
        m.setPotencia("20 hp");
    }

    @Override
    public void buildMarca() {
        auto.setMarca("ford");
    }

    @Override
    public void buildModelo() {
        auto.setModelo("focus");
    }

    @Override
    public void buildPuertas() {
        auto.setCantidaddepuertas(4);
    }
}
