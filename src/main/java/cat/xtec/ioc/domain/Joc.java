package cat.xtec.ioc.domain;


import java.util.List;

public class Joc {


    private String name;
    private int quantity;
    String tipusJoc;

    public Joc(String name, int quantity, String tipusJoc) {
        this.name = name;
        this.quantity = quantity;
        this.tipusJoc = tipusJoc;
    }

    
    
    public Joc(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
       
    }
    
    public Joc() {
    }

        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

  public String getTipusJoc() {
        return tipusJoc;
    }

    public void setTipusJoc(String tipusJoc) {
        this.tipusJoc = tipusJoc;
    }



   



    


}