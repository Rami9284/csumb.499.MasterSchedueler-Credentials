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
        //implementation
    }

    /*
     required: String variable containing the username of a user
     response: returns user
    */
    @CrossOrigin(origins = "*")
    @GetMapping("/findusername/{username}")
    public User findUser(@PathVariable String username) {
       //implementation
    }

     /*
     required: String variable containing the id of a user
     response: List of users
    */
    @CrossOrigin(origins = "*")
    @GetMapping("/finduserId/{id}")
    public User findUserById(@PathVariable String id) {
        //implementation
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
        //implementation
    }

    //===============Update a User===================
     /*
      
     */
     @CrossOrigin(origins = "*")
     @PutMapping("/updateuser")
     public User updateUser(@RequestBody User u){
         //implementation
     }

     //===============Removing a User===================
     /*
     required: User object to add
     response: successful-> returns null
               failure -> returns user
    
    @CrossOrigin(origins = "*")
    @DeleteMapping("/removeuser/{userId}")
    public User removeUser(@PathVariable String userId) {
        try {
            userRepo.remove(userRepo.findById(userId).get())
        }
        catch (Exception e){
            return u;
        }
        return null;
    }
     */
}

