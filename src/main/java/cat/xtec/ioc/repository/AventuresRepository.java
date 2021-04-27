package cat.xtec.ioc.repository;

import cat.xtec.ioc.domain.Aventures;
import cat.xtec.ioc.repository.AventuresRepository;



import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class AventuresRepository  {

   // private List<Joc> listOfJocs = new ArrayList<Joc>();
    private List<Aventures> listOfAventures = new ArrayList<Aventures>();
    
    
    public AventuresRepository() {
        //Mario, Sonic, Crash
        
        
        //Plataformes mario = new Plataformes("Mario", "Tres", 1000);

        Aventures sonic = new Aventures("Sonic", "Arcade", 2000);

        //Conduccio crash = new Conduccio("Crash", "Simulació", 3000);

        //listOfJocs.add(mario);
        listOfAventures.add(sonic);
        //listOfJocs.add(crash);
        
     
    }




       public void addAventures(Aventures aventures) {
        listOfAventures.add(aventures);
    }
        


 





 

}