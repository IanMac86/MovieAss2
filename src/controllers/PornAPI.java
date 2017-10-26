package controllers;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import models.Movie;
import models.Rating;
import models.User;

public class PornAPI
{
	 private Map<Long, User> userIndex  = new HashMap<>();
	 private Map<String, User>emailIndex = new HashMap<>();
	 private Map<Long, Movie> movieIndex = new HashMap<>();
	
	 
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
	  
	  public User getUserByAge(String age) 
	  {
	    return emailIndex.get(age);
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
  public void createmovie(Long id, String type, String location, double distance)
  {
	  Movie movie = new Movie (type, location, distance);
    Optional<User> user = Optional.fromNullable(userIndex.get(id));
    if (user.isPresent())
    {
      user.get().movie.put(movie.id, movie);
      movieIndex.put(movie.id, movie);
    }
  }

  public movie getmovie (Long id)
  {
    return movieIndex.get(id);
  }

  public void addRating(Long id, float latitude, float longitude)
  {
    Optional<Movie> movie = Optional.fromNullable(movieIndex.get(id));
    if (movie.isPresent())
    {
    	movie.get().route.add(new Rating(latitude, longitude));
}
  }
  }

