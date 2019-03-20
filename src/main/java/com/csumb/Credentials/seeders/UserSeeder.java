package com.csumb.Credentials.seeders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.csumb.Credentials.entities.User;
import com.csumb.Credentials.repositories.IUserRepository;

@Component
public class UserSeeder implements CommandLineRunner {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public void run(String... args)throws  Exception{

        List<User> users = Arrays.asList(new User("admin0", "admin", "admin123"), new User("admin1", "admin1","admin124"));
        
        userRepository.deleteAll();
        userRepository.saveAll(users);
    }

}