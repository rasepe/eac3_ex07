package cat.xtec.ioc.controller;

import cat.xtec.ioc.domain.Joc;
import cat.xtec.ioc.domain.Aventures;
import cat.xtec.ioc.domain.Conduccio;
import cat.xtec.ioc.domain.Plataformes;
import cat.xtec.ioc.service.AventuresService;
import cat.xtec.ioc.service.ConduccioService;
import cat.xtec.ioc.service.JocService;
import cat.xtec.ioc.service.PlataformesService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/jocs")
public class PlataformesController {
    
    @Autowired
    private PlataformesService plataformesService;
    
    @Autowired
    private JocService jocService;
    
    @RequestMapping(value = "/add/plataformes", method = RequestMethod.POST)
    public String processAddNewJocForm(@ModelAttribute("newPlataformes") Plataformes newPlataformesToAdd, BindingResult result) {
        String[] suppressedFields = result.getSuppressedFields();
        if (suppressedFields.length > 0) {
            throw new RuntimeException("Intentat accedir amb camps no permesos: " + StringUtils.arrayToCommaDelimitedString(suppressedFields));
        }
        newPlataformesToAdd.setTipusJoc("Plataformes");
        plataformesService.addPlataformes(newPlataformesToAdd);
        jocService.addJoc(newPlataformesToAdd);
        return "redirect:/jocs/all";
    }
    

    
    

    
    
}