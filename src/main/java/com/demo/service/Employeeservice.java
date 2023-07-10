package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.demo.dao.Employeedao;
import com.demo.entity.Employee;

@Component
@Service	
public class Employeeservice {

	@Autowired
	Employeedao empdao;
	
	
	public void addemp(Employee emp) {
		empdao.addemployee(emp);
	}
	
	public List<Employee> getall(){
		return empdao.getAll();
	}
	
	public Employee getbyid(Long id) {
		return empdao.getemployebyid(id);
	}
	
	public void updateemp(Employee emp) {
		empdao.updateemployee(emp);
	}
	
	public void deleteemp(Long id) {
		empdao.deleteemp(id);
	}
	
}
