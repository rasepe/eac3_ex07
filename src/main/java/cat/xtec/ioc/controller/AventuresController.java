package cat.xtec.ioc.controller;


import cat.xtec.ioc.domain.Aventures;
import cat.xtec.ioc.service.AventuresService;
import cat.xtec.ioc.service.JocService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/jocs")
public class AventuresController {

    @Autowired
    private AventuresService aventuresService;

  @Autowired
    private JocService jocService;
  

    
   @RequestMapping(value = "/add/aventures", method = RequestMethod.POST)
    public String processAddNewAventuresForm(@ModelAttribute("newAventures") Aventures newAventuresToAdd, BindingResult result) {
        String[] suppressedFields = result.getSuppressedFields();
        if (suppressedFields.length > 0) {
            throw new RuntimeException("Intentat accedir amb camps no permesos: " + StringUtils.arrayToCommaDelimitedString(suppressedFields));
        }
        newAventuresToAdd.setTipusJoc("Aventures");
        aventuresService.addAventures(newAventuresToAdd);
        jocService.addJoc(newAventuresToAdd);
        
        return "redirect:/jocs/all";
    }
    

    
    

    
    
}