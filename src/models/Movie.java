package models;

import static com.google.common.base.MoreObjects.toStringHelper;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Objects;

public class Movie { 
	  static Long   counter = 0l;

	  public Long   id;

	  public String title;
	  public String year;
	  public String director;

	  public List<Movie > route = new ArrayList<>();

	  public Movie ()
	  {
	  }

	  public Movie (String title, String year, String director)
	  {
	    this.id        = counter++;
	    this.title     = title;
	    this.year      = year;
	    this.director  = director;
	  }

	  public void setTitle(String title){
			 this.title = title;
		 }
		 
		 public String getTitle(){
			 return title;
		 }
		 
		 public void setYear(String year){
			 this.year = year;
		 }
		 
		 public String getYear(){
			 return year;
		 }
		 		 		
		 public void setDirector(String director){
			 this.director = director;
		 }
		 
		 public String getDirector(){
			 return director;
		 }
		 
		 

	  @Override
	  public String toString()
	  {
	    return toStringHelper(this).addValue(id)
	                               .addValue(title)
	                               .addValue(year)
	                               .addValue(director)
	                               .addValue(route)
	                               .toString();
	  }

	  @Override  
	  public int hashCode()  
	  {  
	     return Objects.hashCode(this.id, this.title, this.year, this.director);  
	  } 
	}
//activtities to movies
