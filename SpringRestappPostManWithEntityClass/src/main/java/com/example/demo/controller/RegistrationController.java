package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.Registration;
import com.example.demo.beans.RegistrationModel;
import com.example.demo.service.RegistrationServiceImpl;

@RestController
public class RegistrationController {
	
	
	private RegistrationServiceImpl ri;
	
	//santhosh dev changes
	
	@GetMapping("/")
	public String welcome() {
		return "welcome To Spring Boot Application";
	}
	
	//dev
	//for insert purpose
	@PostMapping("/insert1") 
	public Registration addUser(@RequestBody Registration reg) {
		
		return ri.addUser(reg);
	}
	//for all data purpose
	@GetMapping("/list1")
	public List<Registration> getList(){
		return ri.getList();
	}
	//for based on name purpose
	@GetMapping("/list/{name}")
	public  List<Registration> name1(@PathVariable String  name) {
		List<Registration> nameList = ri.nameList(name);
		return nameList;
		
	}//for example two names are same then we use with id
	@GetMapping("/list/{name}/{id}")
	public Registration nameAndId(@PathVariable String name,@PathVariable int id) {
		return ri.nameAndId( name, id);
		
		
	}
	@GetMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
	   ri.delete(id);
	}

	@PostMapping("/update")
	public Registration Update( Registration reg) {
		return ri.Update(reg);
		
	}
}
