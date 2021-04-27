package cat.xtec.ioc.controller;

import cat.xtec.ioc.domain.Joc;
import cat.xtec.ioc.domain.Aventures;
import cat.xtec.ioc.domain.Conduccio;
import cat.xtec.ioc.domain.Plataformes;

import cat.xtec.ioc.service.JocService;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/jocs")
public class JocController {

    @Autowired
    private JocService jocService;

    @RequestMapping("/{name}")
    public ModelAndView getJocByName(@PathVariable("name") String nomJoc, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ModelAndView modelview = new ModelAndView("stock");
        modelview.getModelMap().addAttribute("joc", jocService.getJocByName(nomJoc));
        return modelview;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ModelAndView modelview = new ModelAndView("cercaJoc");
        Joc newJoc = new Joc();
        modelview.getModelMap().addAttribute("findJoc", newJoc);
        return modelview;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String processForm(@ModelAttribute("findJoc") Joc joc) {
        return "redirect:/jocs/" + joc.getName();
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView getAddNewTipusForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ModelAndView modelview = new ModelAndView("escullTipus");
        //  Tipus newTipus = new Tipus();
        //modelview.getModelMap().addAttribute("tipus", jocService.getAllTipus());
        return modelview;
    }

    @RequestMapping(value = "/add/{tipus}", method = RequestMethod.GET)
    public ModelAndView getAddNewJocForm(@PathVariable("tipus") String tipusJoc, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ModelAndView modelview1 = new ModelAndView("afegeixAventures");
        ModelAndView modelview2 = new ModelAndView("afegeixConduccio");
        ModelAndView modelview3 = new ModelAndView("afegeixPlataformes");
        ModelAndView modelviewRetorn = null;
        if (tipusJoc.equals("aventures")) {

            Aventures newAventures = new Aventures();
            modelview1.getModelMap().addAttribute("newAventures", newAventures);
            modelviewRetorn = modelview1;
        } else if (tipusJoc.equals("conduccio")) {

            Conduccio newConduccio = new Conduccio();
            modelview2.getModelMap().addAttribute("newConduccio", newConduccio);
            modelviewRetorn = modelview2;
        } else if (tipusJoc.equals("plataformes")) {

            Plataformes newPlataformes = new Plataformes();
            modelview3.getModelMap().addAttribute("newPlataformes", newPlataformes);
            modelviewRetorn = modelview3;
        }

        return modelviewRetorn;

    }

    @RequestMapping("/all")
    public ModelAndView allJocs(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ModelAndView modelview = new ModelAndView("jocs");
        modelview.getModelMap().addAttribute("jocs", jocService.getAllJocs());
        return modelview;
    }

}
