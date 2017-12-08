package controllers;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.base.Optional;

import models.Movie;
import models.Rating;
import models.User;
import Utils.Serializer;

public class CodeRedMoviesAPI
{
	 private Serializer serializer;
	 private Map<Long, User> userIndex  = new HashMap<>();
	 private Map<String, Movie>movieIndex = new HashMap<>();
	 private Map<String, Rating> ratingIndex = new HashMap<>();
	
	 public CodeRedMoviesAPI()
	 {
	 
	 }
	 
	
	 

	
	  public CodeRedMoviesAPI(Serializer serializer)
	  {
	    this.serializer = serializer;
	  }

	  @SuppressWarnings("unchecked")
	  public void load() throws Exception
	  {
	    serializer.read();
	      userIndex   = (Map<Long, User>)  serializer.pop();
	      ratingIndex = (Map<String, Rating>)   serializer.pop();
	      movieIndex = (Map<String, Movie>) serializer.pop();
	    }
	   
	  void store() throws Exception
	  {
	    serializer.push(userIndex);
	    serializer.push(ratingIndex);
	    serializer.push(movieIndex);
	    serializer.write(); 
	  }
	    
	  public Collection<User> getUsers ()
	  {
	    return userIndex.values();
	  }
	 
	   

	 public  void deleteUsers() 
	  {
	    userIndex.clear();
	  }

	  public User createUser(String firstName, String lastName, String age, String gender, String occupation) 
	  {
	    User user = new User (firstName, lastName, age, gender, occupation);
	    userIndex.put(user.id, user);
	    return user;
	  }
	  
	  public Movie getMovieByTitle(String Title) 
	  {
	    return movieIndex.get(Title);
	  }
	  
	  public User getUserByFirstName(String FirstName) 
	  {
	    return userIndex.get(FirstName);
	  }
	  
	  
	  public User getUser(Long id) 
	  {
	    return userIndex.get(id);
	  }

  public void deleteUser(Long id) 
  {
    User user = userIndex.remove(id);
     }
  
  
  public Movie addMovie(String title, String year, String director) {
		 Movie movie = new Movie (title, year, director);
		 movieIndex.put(title, movie);
		 return movie;
	 }
  
  public void removeMovie(String title)  {
		 
		 Optional<Movie> user = Optional.fromNullable(getMovieByTitle(title));
		    if (user.isPresent())
		    {
		    	movieIndex.remove(title);
		    }
		    
	  }
  public Movie getMovie (Long id)
  {
    return movieIndex.get(id);
  }

  public void addRating(int userRating, int rateMovie, int ratingid)
  {
    Optional<Movie> movie = Optional.fromNullable(movieIndex.get(userRating));
    if (movie.isPresent())
    {
    	//movie.get().route.add(new Rating(userRating, rateMovie, ratingid));
}
  }
  }

