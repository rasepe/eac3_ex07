package cat.xtec.ioc.service.impl;


import cat.xtec.ioc.domain.Aventures;
import cat.xtec.ioc.repository.AventuresRepository;
import cat.xtec.ioc.service.AventuresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AventuresServiceImpl implements AventuresService {

    @Autowired
    private AventuresRepository aventuresRepository;







    public void addAventures(Aventures aventures) {
        aventuresRepository.addAventures(aventures);
    }





}