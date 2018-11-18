/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

import source.builder.Auto;
import source.builder.AutoDirector;
import source.builder.FiatBuilder;
import source.builder.FordBuilder;

/**
 *
 * @author jersonandres
 */
public class main {
    
    public static void main(String[] args) throws CloneNotSupportedException{
        
        AutoDirector ad= new AutoDirector();
        ad.setAutoBuilder(new FordBuilder());
       ad.constructAuto();
       Auto au= ad.getAuto();
       Auto ab= (Auto) au.clone();
       System.out.println("au "+au.toString());
       
       System.out.println("ab " +ab.toString());
       ad.setAutoBuilder(new FiatBuilder());
       ad.setAuto(au);
       ad.reconstruirAuto();
              System.out.println("au "+au.toString());
       
       System.out.println("ab " +ab.toString());
           
    }
    
}
