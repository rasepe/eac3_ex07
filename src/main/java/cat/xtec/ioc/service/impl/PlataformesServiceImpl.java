package cat.xtec.ioc.service.impl;


import cat.xtec.ioc.domain.Plataformes;
import cat.xtec.ioc.repository.PlataformesRepository;
import cat.xtec.ioc.service.PlataformesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlataformesServiceImpl implements PlataformesService {

    @Autowired
    private PlataformesRepository plataformesRepository;







    public void addPlataformes(Plataformes plataformes) {
        plataformesRepository.addPlataformes(plataformes);
    }





}