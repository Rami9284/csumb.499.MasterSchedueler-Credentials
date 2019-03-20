package com.csumb.Credentials.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

 
@Document   
public class User{

    @Id
    private String id;
    private String name;
    private String username;
    private String password;
    private String email;

    public User(){

    }

    public User(String name,String username, String password, String email){
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public User(String name,String username, String password){
        this.name = name;
        this.username = username;
        this.password = password;
    }


    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

    @Override
    public int hashCode() {
        return Objects.hash(id, name, username, password, email);
    }

	@Override
	public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return id.equals(user.id) &&
                name.equals(user.name) &&
                username.equals(user.username) &&
                password.equals(user.password) &&
                email.equals(user.email);
	}

	@Override
	public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", username=" + username +
                ", email='" + email + '\'' +
                '}';
	}


}