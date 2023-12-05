package com.dj.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dj.entity.Company;

@Repository
public class CompanyRepository {
	
	@Autowired
	JdbcTemplate jt;
	
	public List<Company> getCompanies(){
		return (List<Company>) jt.query("select * from company", (rs,i) -> {
			Company c = new Company();
			c.setCompanyId(rs.getInt("compId"));
			c.setCompanyName(rs.getString("compname"));
			c.setCompanyLocation(rs.getString("complocation"));
			return c;
		});
	}


}
