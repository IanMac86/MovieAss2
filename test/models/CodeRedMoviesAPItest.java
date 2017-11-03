package models;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import controllers.CodeRedMoviesAPI;
import static models.Fixtures.users;
import static models.Fixtures.movies;
import static models.Fixtures.rating;

public class CodeRedMoviesAPItest {
	private CodeRedMoviesAPI CodeRedMovie;
	
	 @Before
	  public void setup()
	  {
		 CodeRedMovie = new CodeRedMoviesAPI();
	  }

	  @After
	  public void tearDown()
	  {
		  CodeRedMovie = null;
	  }

	  @Test
	  public void testUser()
	  {
	    assertEquals (0, CodeRedMovie.getUsers().size());
	  } 
	

@Test
public void testUserEmpty()
{
  User lisa = new User ("Lisa", "Simpson", "female", "8","School/Jazz Musican");

  assertEquals (0, CodeRedMovie.getUsers().size());
  CodeRedMovie.createUser("Lisa", "Simpson", "female", "8","School/Jazz Musican");
  assertEquals (1, CodeRedMovie.getUsers().size());
}
}
