package models;

import static com.google.common.base.MoreObjects.toStringHelper;

import com.google.common.base.Objects;



public class User {
	  public String firstName;
	  public String lastName;
	  public String gender;
	  public String age;
	  public String occupation;
	  public Long id;
	  public Long counter = (long) 01;

	 // public Map<Long, Activity> activities = new HashMap<>();
	 	
	  
	  public User(String firstName, String lastName, String gender, String age,String occupation) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.occupation = occupation;
		this.id = counter ++;
	}

	@Override  
	  public int hashCode()  
	  {  
	     return Objects.hashCode(this.lastName, this.firstName, this.gender, this.age, this.occupation);  
	  }

	 
	  @Override
	  public String toString()
	  {
	    return toStringHelper(this).addValue(firstName)
	                               .addValue(lastName)
	                               .addValue(age)
	                               .addValue(gender)
	                               .addValue(occupation)
	                               .toString();
	 
	  
	}
}

