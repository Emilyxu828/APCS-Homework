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

    public static void main(String[] args){
	Arraystuff as = new Arraystuff();
	System.out.println(as);
	System.out.println(as.find(65));
	System.out.println(as.find(66));
	System.out.println(as.find(123));
        System.out.println(as.maxval());
	System.out.println("sum67 with array {1, 6, 4, 5, 3}: " + as.sum67(test1));
	System.out.println("more14 with array {1, 1, 4, 4, 1}: " + as.more14(test2));
	System.out.println("tenRun with array {10, 1, 9, 20}: " + as.printArray(as.tenRun(test3)));
	System.out.println("tripleUp with array {1, 2, 4, 5, 7, 6, 5, 6, 7, 6}: " + as.tripleUp(test4));
	System.out.println("canBalance with array {1, 2, 3, 1, 0, 2, 3}: " + as.canBalance(test5));
	System.out.println("seriesUp with int 6:  " + as.printArray(as.seriesUp(6)));
	System.out.println("freq with int 4: " + as.freq(2)); 
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
