package cat.xtec.ioc.service;

import cat.xtec.ioc.domain.Joc;
import cat.xtec.ioc.domain.Aventures;
import cat.xtec.ioc.domain.Conduccio;
import cat.xtec.ioc.domain.Plataformes;

import java.util.List;


public interface JocService {


    Joc getJocByName (String nomJoc);
     
   List<Joc> getAllJocs();

    void addJoc(Joc newJocToAdd);



   
}