package com.example.demo.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.Registration;

@Repository
public interface RegistrationInterface extends JpaRepository<Registration, Integer> {
	//
	//@Query("select uname,email from registration where uname=:name")
	public List<Registration> findByRname(String name);
	
	public Registration  findByRnameAndRid(String name,int id);

	
}
