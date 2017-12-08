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
	  public void setFirstName(String firstName){
			 this.firstName = firstName;
		 }
		 
		 public String getFirstName(){
			 return firstName;
		 }
		 
		 public void setLastName(String lastName){
			 this.lastName = lastName;
		 }
		 
		 public String getLastName(){
			 return lastName;
		 }
		 
		 public void setAge(String age){
			 this.age = age;
		 }
		 
		 public String getAge(){
			 return age;
		 }
		 
		 public void setGender(String gender){
			 this.gender = gender;
		 }
		 
		 public String getgender(){
			 return gender;
		 }
		 
		 public void setOccupation(String occupation){
			 this.occupation = occupation;
		 }
		 
		 public String getOccupation(){
			 return occupation;
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
	  @Override
	  public boolean equals(final Object obj)
	  {
		  if(obj instanceof User)
		  {
			  final User other = (User)obj;
			  return Objects.equal(firstName, other.firstName)
				  && Objects.equal(lastName, other.lastName)
				  && Objects.equal(gender, other.gender)
				  && Objects.equal(age, other.age)
				  && Objects.equal(occupation, other.occupation);
		  }
		  else
		  {
			  return false;
		  }
	  }
}
	  
	  

