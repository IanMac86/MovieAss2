package controllers;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import models.User;

public class PornAPI
{
	 private Map<Long, User> userIndex  = new HashMap<>();
	 private Map<String, User>emailIndex = new HashMap<>();

	
	 
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
}
  

