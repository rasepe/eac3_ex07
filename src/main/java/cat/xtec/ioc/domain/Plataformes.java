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
public class Plataformes extends Joc {
    
    String subgenere;

    public Plataformes(String name, String subgenere, int quantity) {
        super(name, quantity, "Plataformes");
        this.subgenere = subgenere;
        //super.setTipusJoc("Plataformes");
    }


    public Plataformes() {
        
    }

    public String getSubgenere() {
        return subgenere;
    }

    public void setSubgenere(String subgenere) {
        this.subgenere = subgenere;
    }


    
    




    
}
