package cat.xtec.ioc.service.impl;


import cat.xtec.ioc.domain.Conduccio;
import cat.xtec.ioc.repository.ConduccioRepository;
import cat.xtec.ioc.service.ConduccioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConduccioServiceImpl implements ConduccioService {

    @Autowired
    private ConduccioRepository conduccioRepository;







    public void addConduccio(Conduccio conduccio) {
        conduccioRepository.addConduccio(conduccio);
        
    }





}