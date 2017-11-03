package controllers;

import java.io.IOException;
import java.util.Collection;


import models.User;

public class MainLad
{
  public static void main(String[] args) throws IOException
  {    
   
    
	  CodeRedMoviesAPI CodeRedMoviesAPI = new CodeRedMoviesAPI();

	  CodeRedMoviesAPI.createUser("Bart", "Simpson","male","10", "School");
	  CodeRedMoviesAPI.createUser("Homer", "Simpson","male" ,"38" ,"Nuclear");
	  CodeRedMoviesAPI.createUser("Lisa", "Simpson", "female", "8","School/Jazz Musican");

    Collection<User> users = CodeRedMoviesAPI.getUsers();
    System.out.println(users);

    User homer = CodeRedMoviesAPI.getUserByFirstName("Bart");
    System.out.println(homer);

    CodeRedMoviesAPI.deleteUser(homer.id);
    users = CodeRedMoviesAPI.getUsers();
    System.out.println(users);
  }
}
