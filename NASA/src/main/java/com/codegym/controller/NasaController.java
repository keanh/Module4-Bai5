package com.codegym.controller;

import com.codegym.service.NasaService;
import com.codegym.model.Nasa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class NasaController {
    @Autowired
    private NasaService nasaService;

    @GetMapping("/create-nasa")
    public String viewNasa(Model model){
        model.addAttribute("nasa",new Nasa());
        return "nasa";
    }

    @GetMapping("/list-comment")
    public ModelAndView listComment(@RequestParam("s")Optional<String> s, Pageable pageable){
        Page<Nasa> nasas;
        if (s.isPresent()){
            nasas = nasaService.findAllByNameContaining(s.get(),pageable);
        }else{
            nasas = nasaService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("view-comment");
        modelAndView.addObject("nasas",nasas);
        return modelAndView;
    }

    @PostMapping("/create-nasa")
    public ModelAndView create(@ModelAttribute("nasa") Nasa nasa){
        nasaService.save(nasa);
        ModelAndView modelAndView = new ModelAndView("nasa");
        return modelAndView;
    }

}
