package com.dhreeti.springbootRTA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;;

@Repository
public interface usersInt extends JpaRepository<User,Long>{
 
	
	 
}
