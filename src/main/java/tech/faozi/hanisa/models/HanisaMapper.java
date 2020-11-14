package tech.faozi.hanisa.models;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HanisaMapper implements RowMapper<HanisaResult> {
    @Override
    public HanisaResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        Hanisa hanisa = new Hanisa();
        hanisa.setId(rs.getInt("id"));
        hanisa.setShortDesc(rs.getString("short_desc"));
        //hanisa.setValue(rs.getString("long_desc"));

        HanisaResult hanisaResult = new HanisaResult();
        hanisaResult.setId(rs.getInt("id"));
        hanisaResult.setShortDesc(rs.getString("short_desc"));
        return hanisaResult;
    }
}
