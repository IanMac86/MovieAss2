package models;

import static com.google.common.base.MoreObjects.toStringHelper;

import com.google.common.base.Objects;

public class Rating {
	
	  public int userRating;
	  public int rateMovie;
	  public int ratingid;
	  //public Rating)
	  {
	  }

	  public Rating (int userRating, int rateMovie, int ratingid)
	  {
	    this.userRating   = userRating;
	    this.rateMovie  = rateMovie;
	    this.ratingid = ratingid;
	  }

	  @Override
	  public String toString()
	  {
	    return toStringHelper(this).addValue(userRating)
	                               .addValue(rateMovie)
	                               .addValue(ratingid)                              
	                               .toString();
	  }

	  @Override  
	  public int hashCode()  
	  {  
	     return Objects.hashCode(this.userRating, this.rateMovie, this.ratingid);  
	  } 
	}
//locations to ratings