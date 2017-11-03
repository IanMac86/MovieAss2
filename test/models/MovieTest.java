package models;


import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test; 

public class MovieTest {

	private Movie[] movies =
		  {
		    new Movie ("Aliens",  "1986", "James Cameron"),
		    new Movie ("Se7en",  "1995", "David Fincher"),
		    new Movie ("Goodfellas",   "1990",  "Martin Scorsese "),
		    new Movie ("Léon: The Professional",  "1994","Luc Besson"),
		    new Movie ("Raiders of the Lost Ark", "1981", "Steven Spielberg")
		  };

	      Movie test = new Movie ("Aliens",  "1986", "James Cameron");

		  @Test
		  public void testCreate()
		  {
		    assertEquals ("Aliens",         test.title);
		    assertEquals ("1986",        test.year);
		    assertEquals ( "James Cameron",   test.director);    
		  }

		  @Test
		  public void testToString()
		  {
		    assertEquals ("Movie{" + test.id + ", Aliens, 1986, James Cameron, []}", test.toString());
		  }
		}

//activtities to movies