package com.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import controller.maincontroller.Candidate;


public class CandidateMapper  implements RowMapper<Candidate> {
	public Candidate mapRow(ResultSet rs, int rowNum) throws SQLException {
		Candidate candidate = new Candidate();
		candidate.setWebsite(rs.getString("website"));
		candidate.setCandidateName(rs.getString("candidateName"));
		candidate.setVote(rs.getLong("vote"));
		
		return candidate;
		}

}
