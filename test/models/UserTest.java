package models;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;


import org.junit.Test;

public class UserTest {

	  private User[] users =
		  {
		    new User ("marge", "simpson", "female","37",  "HomeMaker"),
		    new User ("Lisa", "Simpson", "female", "8","School/Jazz Musican"),
		    new User ("Bart", "Simpson","male","10", "School"),
		    new User ("Maggie", "simpson", "female","1",  "Spy")
		  
		  };
	  User homer =  new User ("Homer", "Simpson","male" ,"38" ,"Nuclear");
	  @Test
	  public void testCreate()
	  {
	    assertEquals ("homer",               homer.firstName);
	    assertEquals ("simpson",             homer.lastName);
	    assertEquals ("male",              homer.gender);   
	    assertEquals ("38",                 homer.age);  
	    assertEquals ("Nuclear",              homer.occupation); 
	  }

	  @Test
	  public void testIds()
	  {
	    Set<Long> ids = new HashSet<>();
	    for (User user : users)
	    {
	      ids.add(user.id);
	    }
	    assertEquals (users.length, ids.size());
	  }

	  @Test
	  public void testToString()
	  {
	    assertEquals ("User{" + homer.id + ", homer, simpson, secret, homer@simpson.com}", homer.toString());
	  }
	}
