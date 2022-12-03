package com.example.demo;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private ExecutorService service;
	private ExecutorService User;
	
	//RESTful API
	//creation
	@PostMapping("/user")
	public void add(@RequestBody User s)
	{
	(User) service).create(s);
	}
	//deletion
	@DeleteMapping("/user/{id}")
	public void remove(@PathVariable Integer id)
	{
		((Object) service).delete(id);
	}
	//Retrieve with all the records
	@GetMapping("/user")
	public List<User>list()
	{
		return Service.listAll();
		
	}
	//Retrieve with specific id
	@GetMapping("/user/{id}")
	public ResponseEntity<User> get(@PathVariable Integer id)
	{
		try {
			User s=service.retrieve(id);
			return new ResponseEntity<User>(s,HttpStatus.OK);
		
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
		
		
	}
	//updation
	@PutMapping("/User/{id}")
	public ResponseEntity<User> update(@RequestBody User s, @PathVariable Integer id)
	{
		try {
			@SuppressWarnings("unused")
			User s1=service.retrieve(id);
			service.create(s);
			return new ResponseEntity<User>(s,HttpStatus.OK);
		
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
		
		
	}
	
	
	
	
	

}
