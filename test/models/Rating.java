package models;

import static org.junit.Assert.*;

import org.junit.Test;

public class RatingTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	 @Test
	  public void testCreate()
	  {
	    Rating one = new Rating(23.3f, 33.3f);
	    assertEquals ( 23.3f, one.latitude,0.01);
	    assertEquals ( 33.3f, one.longitude,0.01);
	  }

}
