package controllers;

import java.io.IOException;
import java.util.Collection;


import models.User;

public class MainLad
{
  public static void main(String[] args) throws IOException
  {    
   
    
    PornAPI pornAPI = new PornAPI();

    pornAPI.createUser("Bart", "Simpson","male","10", "School");
    pornAPI.createUser("Homer", "Simpson","male" ,"38" ,"Nuclear");
    pornAPI.createUser("Lisa", "Simpson", "female", "8","School/Jazz Musican");

    Collection<User> users = pornAPI.getUsers();
    System.out.println(users);

    User homer = pornAPI.getUserByAge("38");
    System.out.println(homer);

    pornAPI.deleteUser(homer.id);
    users = pornAPI.getUsers();
    System.out.println(users);
  }
}
