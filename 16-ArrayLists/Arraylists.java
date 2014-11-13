import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
       	ArrayList<Integer> ai;
   	ai=new ArrayList<Integer>();
        Random r = new Random();
	for (int i=0; i<20; i++) {
	    ai.add(r.nextInt(5));
      	}
	System.out.println("Initial ArrayList: " + ai);

	int f = 0;
	while (f<ai.size()-1){
	    if (ai.get(f) == ai.get(f+1))
		ai.remove(f);
	    else
		f++;
	}

	System.out.println("Final ArrayList: " + ai);
    }

}