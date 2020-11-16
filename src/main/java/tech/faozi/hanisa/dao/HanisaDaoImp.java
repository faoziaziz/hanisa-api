package tech.faozi.hanisa.dao;


import tech.faozi.hanisa.models.Hanisa;
import tech.faozi.hanisa.models.HanisaMapper;
import tech.faozi.hanisa.models.HanisaResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Random;

@Transactional
@Repository
public class HanisaDaoImp implements HanisaDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<HanisaResult> getAll() {
        String sql = "select * from portofolio order by id asc";
        List<HanisaResult> hanisa = jdbcTemplate.query(sql, new HanisaMapper());
        return hanisa;
    }

    @Override
    public HanisaResult getHanisaById(int id) {
        String sql2 = "select * from portofolio where id = ?";
        HanisaResult hanisa2 = jdbcTemplate.queryForObject(sql2, new Object[]{id}, new HanisaMapper());
        return hanisa2;
    }

    @Override
    public void addHanisa(Hanisa hanisa){
	String sql="INSERT INTO portofolio(id, short_desc, long_desc) VALUES (?, ?, ?)";
	jdbcTemplate.update(sql, hanisa.getId(), hanisa.getShortDesc(), hanisa.getLongDesc());
    }


}
