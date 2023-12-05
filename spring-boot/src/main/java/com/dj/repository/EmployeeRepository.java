package com.dj.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dj.entity.Employee;

@Repository
public class EmployeeRepository {
	
	@Autowired
	JdbcTemplate jt;
	
	public List<Employee> getEmployees(){
		return (List<Employee>) jt.query("select * from employee", (rs,i) -> {
			Employee e = new Employee();
			e.setAge(rs.getInt("age"));
			e.setName(rs.getString("name"));
			e.setPosition(rs.getString("position"));
			e.setSalary(rs.getDouble("salary"));
			return e;
		});
	}
	
	public void addEmployee(Employee e) {
		jt.update("insert into employee values (?,?,?,?)", e.getName(),e.getAge(),e.getSalary(),e.getPosition());
	}
	public void delete(String name) {
		jt.update("delete from employee where name=?", name);
	}
}
