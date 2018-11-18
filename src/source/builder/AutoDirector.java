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
public class AutoDirector {

    private AutoBuilder ab;

    public void constructAuto() {
        ab.crearAuto();
        ab.buildMarca();
        ab.buildModelo();
        ab.buildMotor();
        ab.buildPuertas();
    }

    public void reconstruirAuto() {
        ab.buildMarca();
        ab.buildModelo();
        ab.buildMotor();
        ab.buildPuertas();
    }

    public void setAutoBuilder(AutoBuilder ab) {
        this.ab = ab;
    }

    public Auto getAuto() {
        return ab.getAuto();
    }

    public void setAuto(Auto au) {
        ab.setAuto(au);
    }

}
