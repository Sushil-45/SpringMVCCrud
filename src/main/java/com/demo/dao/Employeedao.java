package com.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.demo.entity.Employee;

@Component
public class Employeedao {

	@Autowired
	HibernateTemplate hibernatetemplate;
	
	@Transactional
	public void addemployee(Employee emp) {
		
		hibernatetemplate.save(emp);
		
	}
	
	@Transactional
	public List<Employee> getAll(){
		return hibernatetemplate.loadAll(Employee.class);
	}
	
	@Transactional
	public Employee getemployebyid(Long id) {
		return hibernatetemplate.load(Employee.class, id);
	}
	
	@Transactional
	public void updateemployee(Employee emp ) {
		hibernatetemplate.update(emp);
	}
	
	@Transactional
	public void deleteemp(Long id) {
		hibernatetemplate.delete(hibernatetemplate.load(Employee.class, id));
	}
	
}
