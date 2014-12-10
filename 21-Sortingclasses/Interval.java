import java.io.*;
import java.util.*;

public class Interval {

    private int low,high;
    private Random r = new Random();				
    private static int numIntervals = 0;
		
    public Interval(int l, int h){
	low = l;		
	high = h;
     	numIntervals = numIntervals + 1;
    }
		
    public Interval() {
       	int l = r.nextInt(100);
    	int h = l + 1 + r.nextInt(100);
     	low = l;
	high = h;
	numIntervals = numIntervals + 1;
    }

    public int getLow(){
	return low;
    }

    public int getHigh(){
	return high;
    }

    public int compareTo(Interval other){
	int i;
	if (getLow() > other.getLow())
	    i = 1;
	else if (getLow() < other.getLow())
	    i = -1;
	else {
	    if (getHigh() > other.getHigh())
		i = 1;
	    else if (getHigh() < other.getHigh())
		i = -1;
	    else
		i = 0;
	}
	return i;
    }

    public String toString() {
	//String s = "Interval: "+numIntervals+": "+ "["+low+","+high+"]";
	String s = "["+low+","+high+"]";

	return s;
    }


    public static void main(String[] args) {

	Interval ival = new Interval();
      
	Interval[] a = new Interval[10];
      	for (int i = 0; i < a.length; i++) {
	    a[i] = new Interval();
	}
	System.out.println("array of intervals: " + Arrays.toString(a));

	Interval hello = new Interval();
	Interval goodbye = new Interval();
	System.out.println("first interval: " + hello.toString());
	System.out.println("second interval: " + goodbye.toString());
	System.out.println("compareTo result: " + hello.compareTo(goodbye));
    }
}