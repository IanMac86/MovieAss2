package controllers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Collection;


import Utils.XMLSerializer;
import Utils.Serializer;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import models.User;

public class MainLad
{
  public static void main(String[] args) throws Exception
  {    
   
	  File  datastore = new File("datastore2.xml");
	    Serializer serializer = new XMLSerializer(datastore);

	    
	  CodeRedMoviesAPI CodeRedMoviesAPI = new CodeRedMoviesAPI();
	  
	  if (datastore.isFile())
	    {
		  CodeRedMoviesAPI.load();
	    }


	  CodeRedMoviesAPI.createUser("Bart", "Simpson","male","10", "School");
	  CodeRedMoviesAPI.createUser("Homer", "Simpson","male" ,"38" ,"Nuclear");
	  CodeRedMoviesAPI.createUser("Lisa", "Simpson", "female", "8","Jazz Musican");

    Collection<User> users = CodeRedMoviesAPI.getUsers();
    System.out.println(users);

    User homer = CodeRedMoviesAPI.getUserByFirstName("Homer");
    System.out.println(homer);

    
    
    CodeRedMoviesAPI.deleteUser(homer.id);
    users = CodeRedMoviesAPI.getUsers();
    System.out.println(users);
    
    XStream xstream = new XStream(new DomDriver());
    ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("datastore.xml"));
    out.writeObject(users);
    out.close();
    
   
  }
}
