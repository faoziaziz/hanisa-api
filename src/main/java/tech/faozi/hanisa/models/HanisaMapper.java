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
	hanisa.setLongDesc(rs.getString("long_desc"));
	hanisa.setLinkRef(rs.getString("link_ref"));
	hanisa.setLinkPic(rs.getString("link_pic"));
        //hanisa.setValue(rs.getString("long_desc"));

        HanisaResult hanisaResult = new HanisaResult();
        hanisaResult.setId(rs.getInt("id"));
        hanisaResult.setShortDesc(rs.getString("short_desc"));
	hanisaResult.setLongDesc(rs.getString("long_desc"));
	hanisaResult.setLinkRef(rs.getString("link_ref"));
	hanisaResult.setLinkPic(rs.getString("link_pic"));
        return hanisaResult;
    }
}
