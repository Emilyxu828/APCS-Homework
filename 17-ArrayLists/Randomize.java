import java.util.*;
import java.io.*;

public class Randomize{
    public static void main(String[] args){


	/*---------- ArrayList part ----------*/
	     //Initial ArrayList
	ArrayList<Integer> ai = new ArrayList<Integer>();
	for (int i=0; i<10; i++){
	    ai.add(i);
	}
	System.out.println("Original Arraylist: " + ai);
	
	     //New ArrayList
	ArrayList<Integer> newlist = new ArrayList<Integer>();
	for (int c=0; c<10; c++){
	    Random i = new Random();
	    int d = i.nextInt(ai.size());
	    int e = ai.get(d);
	    newlist.add(e);
	    ai.remove(d);
	}
	System.out.println("New Arraylist: " + newlist);


	/*---------- Array part ----------*/
	     //Initial Array
	int[] array = new int[10];
	String arrayout = "{";
	for (int q=0; q<10; q++){
	    array[q]=q;
	    arrayout = arrayout + q + ", ";
	}
	arrayout = arrayout + "}";
	System.out.println("Original Array: " + arrayout);

	     //New Array
	int[] newarray = new int[10];
	boolean canuse;
	int usedval = -1;
	for (int p=0; p<10; p++){
	    canuse = true;
	    while (canuse == true){
		Random ii = new Random();
		int c = ii.nextInt(10);
		if (array[c] != usedval){
		    newarray[p] = array[c];
		    array[c] = usedval;
		    canuse = false;
		}
		else 
		    canuse = true;
	    }
	}
	String newarrayout = "{";
	for (int j=0; j<10; j++)
	    newarrayout = newarrayout + newarray[j] + ", ";
	newarrayout = newarrayout + "}";
	System.out.println("New Array: " + newarrayout);
    }
}
