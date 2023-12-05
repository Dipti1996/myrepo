package com.dj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dj.entity.Company;
import com.dj.repository.CompanyRepository;


@Service
public class CompanyService {
	
	@Autowired
	CompanyRepository cr;
	
	public List<Company> getAllCompanies() {
		return cr.getCompanies();
	}
	

}
