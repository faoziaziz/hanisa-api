package tech.faozi.hanisa.service;

import tech.faozi.hanisa.dao.HanisaDao;
import tech.faozi.hanisa.models.Hanisa;
import tech.faozi.hanisa.models.HanisaResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HanisaServiceImp implements HanisaService{

    @Autowired
    private HanisaDao hanisaDao;

    @Override
    public List<HanisaResult> getAll() {
        return hanisaDao.getAll();
    }

    @Override
    public HanisaResult getHanisaById(int id) {
        return hanisaDao.getHanisaById(id);
    }

    @Override
    public void addHanisa(Hanisa hanisa){
	hanisaDao.addHanisa(hanisa);
    }



}
