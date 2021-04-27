package cat.xtec.ioc.repository.impl;


import cat.xtec.ioc.domain.Aventures;
import cat.xtec.ioc.domain.Conduccio;
import cat.xtec.ioc.domain.Joc;
import cat.xtec.ioc.domain.Plataformes;
import cat.xtec.ioc.repository.JocRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryJocRepository implements JocRepository {

    private List<Joc> listOfJocs = new ArrayList<Joc>();
   // private List<Aventures> listOfAventures = new ArrayList<Aventures>();
   // private List<Conduccio> listOfConduccio = new ArrayList<Conduccio>();
   // private List<Plataformes> listOfPlataformes = new ArrayList<Plataformes>();
       // private List<Joc> listOfJocs = new ArrayList<Joc>();
    //private List<Aventures> listOfAventures = new ArrayList<Aventures>();
    
        public InMemoryJocRepository() {
        //Mario, Sonic, Crash
        
       
   //String name, String subgenere, int quantity
        
          Plataformes mario = new Plataformes("Mario", "Plataformes", 1000);
          mario.setTipusJoc("Plataformes");
        Aventures sonic = new Aventures("Sonic", "Aventures", 2000);
        sonic.setTipusJoc("Aventures");    
        Conduccio crash = new Conduccio("Crash", "Conducció", 3000);
        crash.setTipusJoc("Conduccio");
        
        listOfJocs.add(mario);
        listOfJocs.add(sonic);
        listOfJocs.add(crash);
        
     
    }



    public Joc getJocByName(String nomJoc) {
        Joc jocByName = null;
        for (Joc joc : listOfJocs) {
            if (joc != null && joc.getName() != null
                    && joc.getName().equals(nomJoc)) {
                jocByName = joc;
                break;
            }
        }
        if (jocByName == null) {
            throw new IllegalArgumentException(
                    "No s'han trobat jocs amb el nom: " + nomJoc);
        }
        return jocByName;
    }



    public List<Joc> getAllJocs() {
        return listOfJocs;
    }

   /* public void addTipus(Tipus newTipusToAdd) {
        listOfTipus.add(newTipusToAdd);
    }

    public List<Tipus> getAllTipus() {
        return listOfTipus;
    }*/

    public void addJoc(Joc joc) {
       listOfJocs.add(joc);
    }





 

}