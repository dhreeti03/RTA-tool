package com.dhreeti.springbootRTA;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviceLayer {

	@Autowired
	private usersInt userInt;

	// save user

	public User save(User user) {
		return userInt.save(user);
	}

	// search users
	public List<User> findAll() {
		return userInt.findAll();

	}
	// get user - by ID

	public User findOne(Long userId) {
		return userInt.getOne(userId);
	}
	// delete employee

	public void delete(User user) {
		userInt.delete(user);
	}

}
