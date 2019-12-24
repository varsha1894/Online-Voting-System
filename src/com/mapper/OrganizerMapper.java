package com.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import controller.maincontroller.Organizer;

public class OrganizerMapper implements RowMapper<Organizer> {
public Organizer mapRow(ResultSet rs, int rowNum) throws SQLException {
Organizer organizer = new Organizer();
organizer.setOrganizerName(rs.getString("organizerName"));
organizer.setOrganization(rs.getString("organization"));
organizer.setOrganizerPhone(rs.getString("organizerPhone"));
organizer.setOrganizerEmail(rs.getString("organizerEmail"));
organizer.setWebsite(rs.getString("website"));
organizer.setOrganizerPassword(rs.getString("organizerPassword"));

return organizer;
}
}