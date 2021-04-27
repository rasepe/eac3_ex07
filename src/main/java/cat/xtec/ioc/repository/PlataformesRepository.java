package cat.xtec.ioc.repository;



import cat.xtec.ioc.domain.Plataformes;
import cat.xtec.ioc.repository.PlataformesRepository;





import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class PlataformesRepository  {

   // private List<Joc> listOfJocs = new ArrayList<Joc>();
    private List<Plataformes> listOfPlataformes = new ArrayList<Plataformes>();
    
    
    public PlataformesRepository() {
        //Mario, Sonic, Crash
        
        
        Plataformes mario = new Plataformes("Mario", "Tres", 1000);

        //Aventures sonic = new Aventures("Sonic", "Arcade", 2000);

        //Plataformes crash = new Plataformes("Crash", "Simulació", 3000);

        //listOfJocs.add(mario);
       // listOfAventures.add(sonic);
        listOfPlataformes.add(mario);
        
     
    }




       public void addPlataformes(Plataformes plataforma) {
        listOfPlataformes.add(plataforma);
    }






 





 

}