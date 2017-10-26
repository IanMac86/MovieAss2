package models;

import static com.google.common.base.MoreObjects.toStringHelper;

import com.google.common.base.Objects;

public class Rating {
	
	  static Long   counter = 0l;

	  public Long  id;
	  public float latitude;
	  public float longitude;

	  public Rating)
	  {
	  }

	  public Rating (float latitude, float longitude)
	  {
	    this.id        = counter++;
	    this.latitude  = latitude;
	    this.longitude = longitude;
	  }

	  @Override
	  public String toString()
	  {
	    return toStringHelper(this).addValue(id)
	                               .addValue(latitude)
	                               .addValue(longitude)                              
	                               .toString();
	  }

	  @Override  
	  public int hashCode()  
	  {  
	     return Objects.hashCode(this.id, this.latitude, this.longitude);  
	  } 
	}
//locations to ratings