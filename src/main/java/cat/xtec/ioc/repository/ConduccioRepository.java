package cat.xtec.ioc.repository;



import cat.xtec.ioc.domain.Conduccio;
import cat.xtec.ioc.repository.ConduccioRepository;




import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ConduccioRepository  {

   // private List<Joc> listOfJocs = new ArrayList<Joc>();
    private List<Conduccio> listOfConduccio = new ArrayList<Conduccio>();
    
    
    public ConduccioRepository() {
        //Mario, Sonic, Crash
        
        
        //Plataformes mario = new Plataformes("Mario", "Tres", 1000);

        //Aventures sonic = new Aventures("Sonic", "Arcade", 2000);

        Conduccio crash = new Conduccio("Crash", "Simulació", 3000);

        //listOfJocs.add(mario);
       // listOfAventures.add(sonic);
        listOfConduccio.add(crash);
        
     
    }




       public void addConduccio(Conduccio conduccio) {
        listOfConduccio.add(conduccio);
    }




 





 

}