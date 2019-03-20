package com.csumb.Credentials.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.csumb.Credentials.entities.User;

@Repository
public interface IUserRepository extends MongoRepository<User, String> {

	User findByUsername(String username);

}