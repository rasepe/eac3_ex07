package cat.xtec.ioc.service.impl;

import cat.xtec.ioc.domain.Joc;
import cat.xtec.ioc.repository.JocRepository;
import cat.xtec.ioc.service.JocService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JocServiceImpl implements JocService {

    @Autowired
    private JocRepository jocRepository;



    public Joc getJocByName (String nomJoc) {
        return jocRepository.getJocByName(nomJoc);
    }


    

   public List<Joc> getAllJocs() {
        return jocRepository.getAllJocs();
    }

 /*   public List<Tipus> getAllTipus() {
        return jocRepository.getAllTipus();
    }

    public void addTipus(Tipus tipus) {
        jocRepository.addTipus(tipus);
    }  */

   /* public void addTipus(Tipus newTipusToAdd) {
        jocRepository.addTipus(newTipusToAdd);
    }

    public List<Tipus> getAllTipus() {
        return jocRepository.getAllTipus();
    }*/

   public void addJoc(Joc joc) {
        jocRepository.addJoc(joc);
    }





}