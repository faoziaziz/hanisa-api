package tech.faozi.hanisa.controller;

import tech.faozi.hanisa.models.City;
import tech.faozi.hanisa.service.ICityService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;
@Controller
public class MyController {


    
    @Autowired
    private ICityService cityService;

    @GetMapping("/showCities")
    public String findCities(Model model) {

        //var cities = (List<City>) cityService.findAll();
	List<City> cities = (List<City>) cityService.findAll();

        model.addAttribute("cities", cities);

        return "showCities";
    }



}
