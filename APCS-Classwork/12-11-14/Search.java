import java.util.*;
import java.io.*;

public class Search{
    private Comparable[] a;

    public Search(int numEle){
	a = new Comparable[numEle];
    }

    public int size(){
	//returns # of items in list (not array size)
	int result = 0;
	for (int i=0; i<a.length; i++) {
	    if (a[i].equals(null) != true)
		result++;
	}
	return result;
    }

    public void additem(String item){
	Comparable[] temparray;
	if (a.length == size()){
	    temparray = new Comparable[a.length + 1];
	    temparray[temparray.length] = item;
	}
	else{
	    temparray = new Comparable[a.length];
	    temparray[temparray.length] = item;
	}
	for (int n=0; n<a.length; n++){
	    temparray[n] = a[n];
	}
	a = temparray;
    }

    public void sort(){
	Arrays.sort(a);
    }

    public Comparable lsearch(Comparable item){       //linear search
        Comparable q = null;
	for (int i=0; i<a.length; i++){
	    if (item.equals(a[i])){
		q = item;
		break;
	    }
	}
	return q;
    }

    public Comparable bsearch(Comparable item){       //binary search
	int low = 0;
	int high = a.length;
	int mid = (low+high)/2;
	Comparable q = null;
	for (int i=0; i<a.length; i++){
	    if (item.compareTo(a[low])==0 || item.compareTo(a[mid])==0 || item.compareTo(a[high])==0){
		q = item;
		break;
	    }
	    else if (item.compareTo(a[low])>0 && item.compareTo(a[mid])>0){
		high = mid;
		mid = (low+high)/2;
	    }
	    else
		low = mid;
	        mid = (low+high)/2;
	}
	return q;
    }

    public Comparable rbsearch(Comparable item, int low, int high){       //recursive binary search
	int mid = (low+high)/2;
        Comparable q= null;
	if (item.compareTo(a[low])==0 || item.compareTo(a[mid])==0 || item.compareTo(a[high])==0){
	    q = item;
	    return q;
	}
	else if (item.compareTo(a[low])>0 && item.compareTo(a[mid])>0){
	    return rbsearch(item, low, mid);
	}
        else
	    return rbsearch(item, mid, high);
	//what about if item is not in a *****************
    }

    public String tostring(){
	String s = "{";
	for (int i=0; i<a.length; i++){
	    s = s + a[i] + ", ";
	}
	s = s + "}";
	return s;	    
    }

    public static void main(String[] args){
	Search wahoo = new Search(5);
	String[] words = {"hello", "goodbye", "a", "b", "c", "juice", "nose", "paper"};
	for (int i=0; i<words.length; i++)
	    wahoo.additem(words[i]);
	System.out.println("before: " + wahoo.tostring());
	wahoo.sort();
	System.out.println("after: " + wahoo.tostring());

	System.out.println(wahoo.lsearch("hello"));
	System.out.println(wahoo.bsearch("goodbye"));
	System.out.println(wahoo.rbsearch("c", 0, wahoo.size()));
    }

}
