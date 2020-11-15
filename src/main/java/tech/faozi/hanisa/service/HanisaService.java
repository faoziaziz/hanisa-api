package tech.faozi.hanisa.service;

import tech.faozi.hanisa.models.Hanisa;
import tech.faozi.hanisa.models.HanisaResult;

import java.util.List;

public interface HanisaService {
    List<HanisaResult> getAll();
    HanisaResult getHanisaById(int id);
    void addHanisa(Hanisa hanisa);
    
    //void addHanisa(Hanisa rest);
    //void updateHanisa(Hanisa rest, int id);
    //void deleteHanisaById(int id);
    //    int lastestInput();

}


