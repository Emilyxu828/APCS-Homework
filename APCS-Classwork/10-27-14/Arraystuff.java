import java.util.*;

public class Arraystuff{
    private int[] a;
    private Random rnd;
    /* by making a variable final, we can't change 
       the value after the initial assignment
    */
    public final int final_example = 123;

    public Arraystuff(int n){
	rnd = new Random();
	a = new int[n];
	for (int i=0; i<a.length;i++){
	    a[i] = 75 + rnd.nextInt(76);
	}
    }
    public Arraystuff(){
	this(100);
    }

    public String toString(){
	String s = "";
	for (int i=0; i<a.length; i++)
	    s = s + a[i] + ", ";
	// this is invalid since the variable is final --->	final_example = 321;
	// s = s +final_example;
	return s;
    }

    public static void main(String[] args){
	Arraystuff as = new Arraystuff();
	System.out.println(as);
    }

    public int find(int value){
    }

    public maxval(){
    }

}




/*

import java.util.Random;
    public int army{
	int[] hello;
	hello = new int[100];
	for (int i = 0; i<100; i++)
	    hello[i] = random;
        return hello;
*/
