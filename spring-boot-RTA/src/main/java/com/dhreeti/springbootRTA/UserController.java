package com.dhreeti.springbootRTA;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dhreeti.springbootRTA.config.UserNotFoundException;

import java.util.HashMap;
import java.util.List; 
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;



@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
@RequestMapping(path = "/demo")
public class UserController {
    
	   
	@Autowired
	serviceLayer serviceLayer;
	
	
	
	// save employee into database 
	
	@PostMapping("/user")
	public User createUser(@Valid @RequestBody User user) {
	
		return serviceLayer.save(user);
		//User added = serviceLayer.save(user);
	//	return createdDTO(added);

	}
	
	
	public User createdDTO (User u) {
		
		User user = new User() ;
		
		user.setFirstName(u.getFirstName());
        user.setLastName(u.getLastName());
        user.setEmail(u.getEmail());
        
        return user;
	}
	
	// get all users 
	
	@GetMapping("/user")
	public List<User> getAllUsers() {
		return serviceLayer.findAll();
		
	}
	
	
	// get employee by ID 
	
    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserId(@PathVariable(value="id") Long userId ) throws UserNotFoundException {
        
    	User user = serviceLayer.findOne(userId);
    	
    	if (user==null) {
    		return ResponseEntity.notFound().build();
    	}
    	return ResponseEntity.ok().body(user);
    }
    
    // update user by Id 
    @PutMapping("/user/{id}") 
    public ResponseEntity<User> updateUser(@PathVariable(value ="id") Long userId, @Valid @RequestBody User userDetails) {
      
    	
    	User user = serviceLayer.findOne(userId);

    	if (user==null) {
    		return ResponseEntity.notFound().build();
    	} 
    	
    
         user.setFirstName(userDetails.getFirstName());
         user.setLastName(userDetails.getLastName());
         user.setEmail(userDetails.getEmail());
         
    	 User update = serviceLayer.save(user);
    	 return ResponseEntity.ok().body(update);
    }
    
    
    
    // delete employee
    @DeleteMapping("/user/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable (value = "id") Long userId) {
    	
    	User user = serviceLayer.findOne(userId);
    	
    	if (user==null) {
    		return ResponseEntity.notFound().build();
    	} 
    	serviceLayer.delete(user);
    	
    	return ResponseEntity.ok().build();
    }
     
    
	
	
	
}
