import java.util.*;

public class Arraystuff{
    private int[] a;
    private Random rnd;
    /* by making a variable final, we can't change 
       the value after the initial assignment
    */
    public final int final_example = 123;

    /*---------- Constructors ----------*/

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
    /*---------- Methods ----------*/

    public String toString(){
	String s = "";
	for (int i=0; i<a.length; i++)
	    s = s + a[i] + ", ";
	// this is invalid since the variable is final --->	final_example = 321;
	// s = s +final_example;
	return s;
    }

            /*----- 14 -----*/
   
    public int find(int value){
	int q = -1;
	for (int i=0; i<a.length; i++){
	    if (a[i] == value) {
		q = i;
		break;
	    }
	    else
		q = q;
	}
	return q;
    }

    public int maxval(){
	int w = a[0];
	for (int i=0; i<a.length-1; i++){
	    if (a[i+1]>w)
		w = a[i+1];
	    else 
		w = w;
	}
	return w;
    }

            /*----- 14b (worked with Jason) -----*/

    public int sum67(int[] nums) {
	int sum = 0;
	boolean dontCount = false;
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] != 6 && dontCount == false) {
		sum = sum + nums[i];
	    }
	    if (nums[i] == 6) {
		dontCount = true;
	    }
	    if (nums[i] == 7) {
		dontCount = false;
	    }
	}
	return sum;
    }

    public boolean more14(int[] nums) {
	int count1 = 0;
	int count4 = 0;
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] == 1) {
		count1++;
	    }
	    if (nums[i] == 4) {
		count4++;
	    }
	}
	if (count1 > count4) {
	    return true;
	}
	return false;
    }

    public int[] tenRun(int[] nums) {
	int tenCount = -1;
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] % 10 == 0) {
		tenCount = nums[i];
	    }
	    if (tenCount != -1) {
		nums[i] = tenCount;
	    }
	}
	return nums;
    }

    public boolean tripleUp(int[] nums) {
	int start = 0;
	for (int i = 0; i < nums.length - 2; i++) {
	    start = nums[i];
	    if (nums[i + 1] == nums[i] + 1 && nums[i + 2] == nums[i] + 2){
		return true;
	    }
	}
	return false;
    }

    public boolean canBalance(int[] nums) {
	int sumBefore = nums[0];
	int sumAfter = 0;
	for (int i = 1; i < nums.length; i++) {
	    sumAfter = sumAfter + nums[i];
	}
	for (int i = 1; i < nums.length; i++) {
	    if (sumBefore == sumAfter) {
		return true;
	    } else {
		sumBefore = sumBefore + nums[i];
		sumAfter = sumAfter - nums[i];
	    }
	}
	return false;
    }

    public int[] seriesUp(int n) {
	int aLen = n*(n+1)/2;
	int index = 0;
	int[] fin = new int[aLen];
	for (int count = 0; count < n; count++){
	    for (int element = 1; element <= count + 1; element++) {
		fin[index] = element;
		index++;
	    }
	}
	return fin;
    }

    public int freq(int n) {
	int lookFor = a[n];
	int freq = 0;
	for (int i = 0; i < a.length; i++){
	    if (a[i] == lookFor){
		freq++;
	    }
	}
	return freq;
    }

    /*---------- for 10/30/14 ----------*/
    // This code only works for half of the codingbat tests :( I'm still trying to figure out the quirks

    public int maxMirror(int[] nums) {
	int arraylength = nums.length;
	int w = 0;
	int i = 0;
	while (i<arraylength){
	    if (nums[i] == nums[arraylength-1-i]){
		w = w + 1;
		i++;
	    }
	    else {
		if (nums[i+1] == nums[arraylength-1-i]){
		    w = w + 1;
		    i++;
		}
		else if (nums[i] == nums[arraylength-1-i-1]){
		    w = w + 1;
		    i++;
		}
		else
		    break;
	    }
	}
	return w;
    }

   /*   public int mode(int[] A){
	int e = 0;
	int r = 0;
	for (int i=0; i<A.length; i++){
	    a = A[i];
	    for (int i=0; i<A.length; i++){
		if (A[i]==a)
		    r++;
		if (r>e)
		    e=r;
	    }
	}
    }
    */

    public int mode(){
	int count = 0;
	int modeIndex = 0;
	for (int i=0; i<a.length; i++){
	    if (freq(a[i]) > count){
		count = freq(a[i]);
		modeIndex = i;
	    }
	}
	System.out.println("modeval = " + a[modeIndex]);
	return count;
    }




    public int mode2(){
	//not finished
	int max = maxval();
	int[] newarray = int[max+1];
	for (int i=0; i<a.length; i++){
	    newarray[a[i]]++;
	}
    }





	   
    public static void main(String[] args){
	Arraystuff as = new Arraystuff();
	System.out.println(as);
       	System.out.println("location of 65 in the array: " + as.find(65));
       	System.out.println("location of 66 in the array: " + as.find(66));
       	System.out.println("location of 67 in the array: " + as.find(123));
	//     System.out.println("maxval in array: " + as.maxval());
	//	System.out.println("sum67 with array {3, 5, 6, 7, 2, 1, 6, 4, 5, 7, 3}: " + as.sum67({3, 5, 6, 7, 2, 1, 6, 4, 5, 7, 3}));
	//	System.out.println("more14 with array {1, 2, 8, 25, 1, 4, 7, 4, 1}: " + as.more14({1, 2, 8, 25, 1, 4, 7,  4, 1}));
	//	System.out.println("tenRun with array {4, 7, 10, 1, 40, 40, 3, 6, 9, 20}: " + as.tenRun({4, 7, 10, 1, 40, 40, 3, 6, 9, 20}));
	//	System.out.println("tripleUp with array {6, 7, 8, 10, 123, 124, 125, 2, 7, 5}: " + as.tripleUp({6, 7, 8, 10, 123, 124, 125, 2, 7, 5}));
	//	System.out.println("canBalance with array {2, 5, 7, 0, 3, 1, 2, 8, 5, 1}: " + as.canBalance({2, 5, 7, 0, 3, 1, 2, 8, 5, 1}));
	//	System.out.println("seriesUp with 23: " + as.seriesUp(23));
	//	System.out.println("frequency of 9 in the array: " + as.freq(9)); 

	System.out.println("modecount " + as.mode());
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
