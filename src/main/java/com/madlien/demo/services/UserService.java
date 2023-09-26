package com.madlien.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madlien.demo.entities.Users;

import com.madlien.demo.interfaces.UsersRepository;
@Service
public class UserService {
	
	   @Autowired
	    private UsersRepository userRepository;//bean

	    public List<Users> getAllUsers() {
	        return userRepository.findAll();
	    }

	    public Users getUserById(Long id) {
	        return userRepository.findById(id).orElse(null);
	    }

	    public Users createUser(Users user) {
	        return userRepository.save(user);
	    }

	    public Users updateUser(Long id, Users user) {
	        return (Users) userRepository.findById(id)
	                .map(existingUser -> {
	                    existingUser.setName(user.getName());
	                    existingUser.setDep(user.getDep());
	                    existingUser.setRole(user.getRole());
	                    existingUser.setNum(user.getNum());
	                    return userRepository.save(existingUser);
	                })
	                .orElse(null);
	    }

	    public void deleteUser(Long id) {
	        userRepository.deleteById(id);
	    }
	}

