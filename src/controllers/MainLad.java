package controllers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Collection;









import Utils.XMLSerializer;
import Utils.Serializer;
import asg.cliche.Command;
import asg.cliche.Param;
import asg.cliche.Shell;
import asg.cliche.ShellFactory;

import com.google.common.base.Optional;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import models.Movie;
import models.User;

public class MainLad
{
	
	public CodeRedMoviesAPI CodeRedMovies;
	
	 public MainLad() throws Exception  {
			
		 
	 		
			File datastore = new File("datastore.xml");
			Serializer serializer = new XMLSerializer(datastore);
				
			CodeRedMovies = new CodeRedMoviesAPI(serializer);
			
			
		  }
	
	
	
	
	
	
  public static void main(String[] args) throws Exception
  {    
   	     
	  MainLad mainlad = new MainLad();
	  
	  Shell shell = ShellFactory.createConsoleShell("cmd", "Well Boi - ?help for instructions", mainlad);
		 shell.commandLoop();
	  
  }
  
  @Command(description="Add a new User")
	 public void addUser (
			 @Param(name="first name") String firstName,
			 @Param(name="last name") String lastName,
			 @Param(name="gender") String gender, 
			 @Param(name="age") String age, 
			 @Param(name="occupation") String occupation){
		 
	  CodeRedMovies.addUser(firstName, lastName, gender, age,  occupation);
	 }
	  
  @Command(description="Delete a User")
	 public void removeUser (@Param(name="ID") String id){
		 
		 CodeRedMovies.removeUser(id);
		 
	 }
  @Command(description="Get all users details")
  public void getUsers ()  {
	  Collection<User> users = CodeRedMovies.getUsers();
	    System.out.println(users);
	  }
  
  @Command(description="Add a Movie")
	 public void addMovie (
			 @Param(name="title") String title, 
			 @Param(name="year") String year, 
			 @Param(name="director") String director)	 {
		 
	  CodeRedMovies.addMovie(title, year, director);
	 }
  @Command(description="Delete a Movie")
	 public void removeMovie (@Param(name="title") String title){
		 
		 Optional<Movie> Movie = Optional.fromNullable(CodeRedMovies.getMovieByTitle(title));
		    if (Movie.isPresent())
		    {
		    	CodeRedMovies.removeMovie(title);
		    }
		 
	 }
  @Command(description="Get a movies details")
  public void getMovie (@Param(name="Title") String title)  {
    Movie movie = CodeRedMovies.getMovieByTitle(title);
    System.out.println(movie);
  }
  @Command(description="Rate a Movie")
	 public void rateMovie (
			 @Param(name="First Name") String firstName, 
			 @Param(name="title") String title, 
			 @Param(name="Movie Rating") String rating){
		 
	  CodeRedMovies.rateMovie(firstName, title, rating);
	 }
  @Command(description="Get user Ratings by first name")
	 public void getUserRatings (
			 @Param(name="firstName") Long firstName){
		 
		 System.out.println(CodeRedMovies.getUser(firstName));
	 }
  }

