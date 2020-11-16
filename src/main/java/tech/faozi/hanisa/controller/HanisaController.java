/*
  @author : Aziz Amerul Faozi
  @desk : this code use for main controller 
*/

package tech.faozi.hanisa.controller;

import tech.faozi.hanisa.models.Hanisa;
import tech.faozi.hanisa.models.HanisaResult;
import tech.faozi.hanisa.service.HanisaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(maxAge=3600)
@Controller
@RequestMapping("portofolio")
public class HanisaController {

    @Autowired
    HanisaService hanisaService;

    
    @CrossOrigin(origins="/**")

    @GetMapping("/{id}")
    public ResponseEntity<HanisaResult> getById(@PathVariable("id") int id) {
        HanisaResult hanisa = hanisaService.getHanisaById(id);
        return new ResponseEntity<HanisaResult>(hanisa, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<HanisaResult>> getAll() {
        List<HanisaResult> listHanisa = hanisaService.getAll();
        return new ResponseEntity<List<HanisaResult>>(listHanisa, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<HanisaResult> addHanisa(@RequestBody Hanisa hanisa){
	hanisaService.addHanisa(hanisa);
	HanisaResult hanisa2 = hanisaService.getHanisaById(413);
	return new ResponseEntity<HanisaResult>(hanisa2, HttpStatus.OK);
    }

}
