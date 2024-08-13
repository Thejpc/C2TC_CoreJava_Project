package com.tnsif.adminservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.NoResultException;

@RestController
public class AdminController {
    @Autowired
	private AdminService service;
    
    @GetMapping("/adminservice")
    public List<Admin> list()
    {
    	return service.listAllRecords();
    }
    
    @PostMapping("/adminservice")
    public void add(@RequestBody Admin ad)
    {
    	service.insertRecord(ad);
    }
    
    
    @GetMapping("/adminservice/{id}")
    public ResponseEntity<Admin> get(@PathVariable Integer id)
    {
    	  try
    	  {
    		Admin ad=service.getParticularRecord(id);
    	    return new ResponseEntity<Admin>(ad, HttpStatus.OK);
    	  }
    	  catch(NoResultException e)
    	  {
    		  return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
    	  }
    	
    }

    @DeleteMapping("/adminservice/{id}")
    public void delete(@PathVariable Integer id)
    {
    	service.delete(id);
    }
}
