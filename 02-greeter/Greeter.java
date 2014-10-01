import java.io.*;
import java.util.*;

/*public class Greeter {
    public void greet() {
	String s = new String("Hello world!");
	System.out.println(s);
	ungreet();
    }
    public void ungreet() {
	System.out.println("I'm out.");
    }
}
*/

public class Greeter {
    //public String greeting = new String("Hello world!");
    private String greeting = new String("Hello world!");

    //constructors
    /*Notes
          the name is the same as the class name
          there is no return type (nothing between public and the name)
          it's ALWAYS public
       
          a constructor is run automatically when you instantiate the class.
          that is, if you have: Greeter g = new Greeter("Hello")
          the Java will automatically call this constructior sending Hello 
          in as parameer g. It will then set the instance variable 
          greeting to what g refers to, which is hello
    */
    public Greeter(String g) {
	System.out.println("In the constructor");
	greeting = g;
    }
    /* we can overload methods (inclduing constructors) which means we habve more than one method with the smae name. They just have to have differnt "signatures"........
     */

    public void setGreeting(String s) {
	greeting = s;
    }
    
    public String getGreeting() {
	    return greeting;
    }
    public String greet() {
	    return greeting;
    }
    public void greet() {
	//String greeting = new String("Sup!");
       System.out.println(greeting);
    }
    public void ungreet() {
	System.out.println(greeting);
    }
}
