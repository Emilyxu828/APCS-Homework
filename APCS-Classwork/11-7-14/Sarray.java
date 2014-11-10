/* I get this error:
Exception in thread "main" java.lang.NullPointerException
	at Sarray.add(Sarray.java:14)
	at Sarray.main(Sarray.java:108)
*/


public class Sarray {
    private int[] data;     
         //should be object[]
    public Sarray(){    
	//start array at size 10
	// set up the initial instance variables
	int[] data = new int[10];
    }

    /*--------- Methods ----------*/
    public boolean add(int i){     
	//add to int
	//adds an item to the end of the list, grow if needed, returns true
	if (data.length == size()){
	    int[] temparray = new int[data.length + 5];
	    for (int n=0; n<data.length; n++){
		temparray[n] = data[n];
	    }
	    data = temparray;
	}
	else 
	    data = data;
        for (int n=0; n<data.length; n++){
	    if (data[n] == 0){
	        data[n] = i;
	        break;
	    }
	}
	return true;
    }

    public void add(int index, int i){
	//add item i at location index, shift everything down as needed,
	// grows as needed
	int[] temparray;
	if (data.length == size()){
	    temparray = new int[data.length + 5];
	}
	else{
	    temparray = new int[data.length];
	}
	for (int n=0; n<data.length; n++){
	    if (n < index)
		temparray[n] = data[n];
	    if (n == index)
		temparray[n] = i;
	    if (n > index)
		temparray[n] = data[n-1];
	}
	data = temparray;
    }

    public int size(){
	//returns # of items in list (not array size)
	int result = 0;
	for (int i=0; i<data.length; i++) {
	    if (data[i] != 0)
		result++;
	}
	return result;
    }

    public int get(int index){
	//returns item at location index of the list
	return data[index];
    }

    public int set(int index, int i){
	//sets item at location index to value i, returns old value
	int result = data[index];
	data[index] = i;
	return result;
    }

    public int remove(int index){
	//must shift things over
	//removes item at index i, returns old value
	/*int result = data[index];
	data[index] = 0;
	return result;*/

	int result = data[index];
	int[] newarray = new int[data.length-1];
	for (int i=0; i<newarray.length; i++){
	    if (i<index)
		newarray[i] = data[i];
	    else
		newarray[i] = data[i+1];
	}
	return result;
    }



    public String tostring(){
	String s = "";
	for (int i=0; i<data.length; i++){
	    s = s + " element " + i + " is " +  data[i] + "\n";
	}
	return s;	    
    }




    public static void main (String args[]){
	Sarray as = new Sarray();
	as.add(23);
	as.add(7);
	as.add(3);
	as.add(12);
	as.add(51);
	as.add(3,9);
	as.add(1,13);
	as.add(6,45);
	as.add(5);
	as.add(9,56);
	System.out.println("Initial Array:");
	System.out.println(as.tostring());
	System.out.println("Size is " + as.size());
	as.remove(3);
	as.remove(6);
	as.add(34);
	as.add(98);
	as.add(100);
	as.add(10,3);
	as.add(2,38);
	System.out.println("New Array:");
	System.out.println(as.tostring());
	System.out.println("Size is " + as.size());
    }
}

  
