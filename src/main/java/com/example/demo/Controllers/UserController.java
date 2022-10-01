package com.example.demo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.repos.UserRepository;


@RestController
@RequestMapping("/users")
public class UserController {
    
    private UserRepository userRepository;

    // Spring Context veriyor
    // ilerleyen zamanlarda bunu servise çekip logic olayını bu sınıftan soyutlayacağız
    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @PostMapping
    public User createUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }

    // Java optionals 
    @GetMapping("/{userId}")
    public User getOneUser(@PathVariable Long userId){
        // custom exception 
        return userRepository.findById(userId).orElse(null);
    }

    @PutMapping("/{userId}")
    public User updatUser(@PathVariable Long userId,@RequestBody User newUser){
        Optional<User> user = userRepository.findById(userId);
        if(user.isPresent()){
            User foundUser = user.get();
            foundUser.setUserName(newUser.getUserName());
            foundUser.setPassword(newUser.getPassword());
            userRepository.save(foundUser);
            return foundUser;
        }
        else{
            return null;
        }
    }
    @DeleteMapping("/{userId}")
    public void deleteOneUser(@PathVariable Long userId){
        userRepository.deleteById(userId);   
    }


}
