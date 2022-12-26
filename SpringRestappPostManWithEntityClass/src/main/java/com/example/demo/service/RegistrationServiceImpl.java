package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.Registration;

import com.example.demo.dao.RegistrationInterface;

//@Service
@Service
public class RegistrationServiceImpl implements RegistrationServicenterface {
	
	@Autowired
	private RegistrationInterface rd;

	
	
	public List<Registration> getList(){
		return rd.findAll();
	}

	public List<Registration> nameList(String name) {
		return rd.findByRname(name);
	}
	
	public Registration nameAndId(String name,int id) {
	
		return rd.findByRnameAndRid(name,id);
	}

	public void delete(int id) {
		
		 rd.deleteById(id);
	}

	public Registration  Update( Registration reg) {
		
		return rd.save(reg);
	}
	

}
