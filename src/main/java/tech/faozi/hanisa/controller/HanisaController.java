package tech.faozi.hanisa.controller;

import tech.faozi.hanisa.models.Hanisa;
import tech.faozi.hanisa.models.HanisaResult;
import tech.faozi.hanisa.service.HanisaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("hanisa")
public class HanisaController {
    @Autowired
    HanisaService hanisaService;

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

}
