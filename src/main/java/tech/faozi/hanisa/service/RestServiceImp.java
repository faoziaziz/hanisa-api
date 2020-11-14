package tech.faozi.hanisa.service;

import tech.faozi.hanisa.dao.RestDao;
import tech.faozi.hanisa.models.Rest;
import tech.faozi.hanisa.models.RestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestServiceImp implements RestService{

    @Autowired
    private RestDao restDao;

    @Override
    public List<RestResult> getAll() {
        return restDao.getAll();
    }

    @Override
    public RestResult getRestById(int id) {
        return restDao.getRestById(id);
    }

    @Override
    public void addRest(Rest rest) {
        restDao.addRest(rest);
    }

    @Override
    public void updateRest(Rest rest, int id) {
        restDao.updateRest(rest, id);
    }

    @Override
    public void deleteRestById(int id) {
        restDao.deleteRestById(id);
    }

    @Override
    public int lastestInput() {
        return restDao.lastestInput();
    }

}
