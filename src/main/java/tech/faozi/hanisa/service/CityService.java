package tech.faozi.hanisa.service;

import tech.faozi.hanisa.models.City;
import tech.faozi.hanisa.repository.CityRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService implements ICityService {

    @Autowired
    private CityRepository repository;

    @Override
    public List<City> findAll() {

        //var cities = (List<City>) repository.findAll();

        return (List<City>) repository.findAll();
    }
}
