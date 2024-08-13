package com.tnsif.adminservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AdminService {
     @Autowired
     private AdminRepository repo;
     
     //insert the record into the database
     public void insertRecord(Admin ad)
     {
    	 repo.save(ad);
     }
     
     //get all the records
     public List<Admin> listAllRecords()
     {
         return repo.findAll();
     }
     
     //retrieve only one record using primary key
     public Admin getParticularRecord(Integer id)
     {
    	 return repo.findById(id).get();
     }
     
     
     //deleting the record from table
     public void delete(Integer id)
     {
    	 repo.deleteById(id);
     }
     
}
     
     
     
     
     
     