package com.madlien.demo.controllers;

import com.madlien.demo.entities.Users;
import com.madlien.demo.interfaces.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UsersRepository userRepository;
    @GetMapping("/list-of-users")
    public List<Users> getAll() {
        return userRepository.findAll();
    }
    @PostMapping("/create-user")
    public Users create(@RequestBody Users user) {
        return userRepository.save(user);
    }
    @GetMapping("/return-user-by-id")
    public Users getById(@PathVariable Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }
    @PutMapping("/update-user-info")
    public Users update(@PathVariable Long id, @RequestBody Users user) {
        return userRepository.save(user);
    }
    @DeleteMapping("/delete-user")
    public void delete(@PathVariable Long id) {
        userRepository.deleteById(id);
    }
}
