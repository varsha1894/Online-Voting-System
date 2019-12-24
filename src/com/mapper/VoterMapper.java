package com.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import controller.maincontroller.Voter;

public class VoterMapper implements RowMapper<Voter> {
	public Voter mapRow(ResultSet rs, int rowNum) throws SQLException {
		Voter voter = new Voter();
	
		voter.setElectoralId(rs.getLong("electoralId"));
		voter.setWebsite(rs.getString("website"));
		voter.setName(rs.getString("name"));
		voter.setEmail(rs.getString("email"));
		voter.setPhone(rs.getString("phone"));
		voter.setPassword(rs.getString("password"));
		voter.setVoted(rs.getShort("voted"));
		return voter;
		}
}