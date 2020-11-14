package tech.faozi.hanisa.service;

import tech.faozi.hanisa.models.Rest;
import tech.faozi.hanisa.models.RestResult;

import java.util.List;

public interface RestService {
    List<RestResult> getAll();
    RestResult getRestById(int id);
    void addRest(Rest rest);
    void updateRest(Rest rest, int id);
    void deleteRestById(int id);
    int lastestInput();

}
