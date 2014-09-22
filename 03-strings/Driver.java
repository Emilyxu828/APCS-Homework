public class Driver {
    public static void main(String[] args){
	String s = "mike zamansky";
    

        /*m  i  k  e  __  z  a  m  a  n  s  k  y
          0  1  2  3  4   5  6  7  8  9  10 11 12*/

    int space = s.indexOf(" ");      /* returns 4*/

	/*
    String first = "";
	int i = 0;

    def hello(){
        if (i<space){
		    char letter = s.charAt(i);
		    first = first + letter;
		    i=i+1;
            hello (i);
	    } 
        else{
		    System.out.println("first name is: " +first);
        }}
    */
    String first = s.substring(0, space);
    System.out.println("first name is: " + first);
	String last = s.substring(space + 1);
	System.out.println("last name is: " +last);
}}
