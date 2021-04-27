/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.xtec.ioc.domain;

import cat.xtec.ioc.domain.Joc;


/**
 *
 * @author Rafel
 */
public class Conduccio extends Joc {
    
    String dimensions;

    public Conduccio(String name, String dimensions, int quantity) {
        super(name, quantity, "Conduccio");
        this.dimensions = dimensions;
       // super.setTipusJoc("Conducció");
    }

    public Conduccio() {
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

 






    
}