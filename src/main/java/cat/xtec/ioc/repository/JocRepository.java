package cat.xtec.ioc.repository;

import cat.xtec.ioc.domain.Joc;

import java.util.List;

public interface JocRepository {
    Joc getJocByName (String nomJoc);

    void addJoc(Joc joc);
    
    List<Joc> getAllJocs();

  /*  public List<Tipus> getAllTipus();

    void addTipus(Tipus tipus); */

 
}

