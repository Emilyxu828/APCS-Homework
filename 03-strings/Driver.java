public class Driver {
	public static void main (String[] args){
	String = "mike zamansky";

        /*m  i  k  e  __  z  a  m  a  n  s  k  y
          0  1  2  3  4   5  6  7  8  9  10 11 12*/

        space = String.indexof(" ");      // returns 4

	first = "";
	i = 0;
	if (i < space){
		char letter = String.charAt(i);
		first = first + letter;
		i=i+1;
	}
	else
		return first;


	last = String.substring(space + 1);
	return last;
}
