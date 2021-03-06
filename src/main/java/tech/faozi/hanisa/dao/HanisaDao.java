package tech.faozi.hanisa.dao;

import tech.faozi.hanisa.models.Hanisa;
import tech.faozi.hanisa.models.HanisaResult;

import java.util.List;

public interface HanisaDao {
    List<HanisaResult> getAll();
    HanisaResult getHanisaById(int id);
    void addHanisa(Hanisa hanisa);
    //void updateHanisa(Hanisa hanisa, int id);
    //    void deleteHanisaById(int id);
    //    int lastestInput();

}
