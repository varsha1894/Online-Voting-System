package com.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import controller.maincontroller.WebsiteCustomize;

public class WebsiteCustomizeMapper implements RowMapper<WebsiteCustomize> {
	public WebsiteCustomize mapRow(ResultSet rs, int rowNum) throws SQLException {
		WebsiteCustomize websitecustomize = new WebsiteCustomize();
		websitecustomize.setWebsite(rs.getString("website"));
		websitecustomize.setStartRegisterDate(rs.getDate("startRegisterDate"));
		websitecustomize.setLastRegisterDate(rs.getDate("lastRegisterDate"));
		websitecustomize.setVotingDate(rs.getDate("votingDate"));
		websitecustomize.setVoteStartTime(rs.getTime("voteStartTime"));
		websitecustomize.setVoteFinishTime(rs.getTime("voteFinishTime"));

		return websitecustomize;
		}
}
