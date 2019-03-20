package com.csumb.Credentials;

import java.util.List;

import com.csumb.Credentials.entities.User;
import com.csumb.Credentials.repositories.IUserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CredentialsController{
    
    @Autowired
    private IUserRepository userRepo;

    //===============Getting a User===================
    /*
     required: Nothing
     response: List of users
    */
    @CrossOrigin(origins = "*")
    @GetMapping("/users")
    public List<User> getusers() {
        return userRepo.findAll();
    }

    /*
     required: String variable containing the username of a user
     response: returns users
    */
    @CrossOrigin(origins = "*")
    @GetMapping("/findusername/{username}")
    public User findUser(@PathVariable String username) {
        return userRepo.findByUsername(username);
    }

     /*
     required: String variable containing the id of a user
     response: List of users
    */
    @CrossOrigin(origins = "*")
    @GetMapping("/finduserId/{id}")
    public User findUserById(@PathVariable String id) {
        return userRepo.findById(id).get();
    }

    //===============Adding a User===================
     /*
     required: User object to add
     response: successful-> returns null
               failure -> returns user
    */
    @CrossOrigin(origins = "*")
    @PostMapping("/adduser")
    public User addUser(@RequestBody User u) {
        try {
            userRepo.insert(u);
        }
        catch (Exception e){
            return u;
        }
        return null;
    }

    //===============Update a User===================
     /*
      
     */
     @CrossOrigin(origins = "*")
     @PutMapping("/updateuser")
     public User updateUser(@RequestBody User u){
         return userRepo.save(u);
     }

     //===============Removing a User===================
     /*
     required: User object to add
     response: successful-> returns null
               failure -> returns user
    */
    @CrossOrigin(origins = "*")
    @GetMapping("/adduser")
    public User removeUser(@RequestBody User u) {
        try {
            userRepo.insert(u);
        }
        catch (Exception e){
            return u;
        }
        return null;
    }
}

