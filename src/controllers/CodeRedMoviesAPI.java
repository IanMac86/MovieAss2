package controllers;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.google.common.base.Optional;

import models.Movie;
import models.Rating;
import models.User;

public class CodeRedMoviesAPI
{
	 private Map<Long, User> userIndex  = new HashMap<>();
	 private Map<String, User>emailIndex = new HashMap<>();
	 private Map<Long, Movie> movieIndex = new HashMap<>();
	
	 public CodeRedMoviesAPI()
	 {
	 
	 }
	 
	 public Collection<User> getUsers ()
	  {
	    return userIndex.values();
	  }


  

	 public  void deleteUsers() 
	  {
	    userIndex.clear();
	    emailIndex.clear();
	  }

	  public User createUser(String firstName, String lastName, String age, String gender, String occupation) 
	  {
	    User user = new User (firstName, lastName, age, gender, occupation);
	    userIndex.put(user.id, user);
	    emailIndex.put(age, user);
	    return user;
	  }
	  
	  public User getUserByFirstName(String FirstName) 
	  {
	    return emailIndex.get(FirstName);
	  }
	  
	  public User getUser(Long id) 
	  {
	    return userIndex.get(id);
	  }

  public void deleteUser(Long id) 
  {
    User user = userIndex.remove(id);
    emailIndex.remove(user.age);
  }
  public Movie addMovie(String title, String year, String director) {
		 Movie movie = new Movie (title, year, director);
		 movieIndex.put(movie.id, movie);
		 return movie;
	 }
  
  public void removeMovie(String id)  {
		 
		 Optional<User> user = Optional.fromNullable(getUserByFirstName(id));
		    if (user.isPresent())
		    {
		    	movieIndex.remove(id);
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

