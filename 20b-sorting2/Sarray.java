 public class Sarray {
    private String[] data;     
         //should be object[]

    public Sarray(){
	//start array at size 10
	//set up the initial instance variables
	data = new String[10];
    }

    /*--------- Methods ----------*/
    public boolean add(String s){     
	//add to String
	//adds an item to the end of the list, grow if needed, returns true
	if (data.length == size()){
	    String[] temparray = new String[data.length + 1];
	    for (int n=0; n<data.length; n++){
		temparray[n] = data[n];
	    }
	    data = temparray;
	}
	else 
	    data = data;
        for (int n=0; n<data.length; n++){
	    if (data[n] == null){
	        data[n] = s;
	        break;
	    }
	}
	return true;
    }

    public void add(int index, String s){
	//add item s at location index, shift everything down as needed,
	// grows as needed
	String[] temparray;
	if (data.length == size()){
	    temparray = new String[data.length + 1];
	}
	else{
	    temparray = new String[data.length];
	}
	for (int n=0; n<data.length; n++){
	    if (n < index)
		temparray[n] = data[n];
	    if (n == index)
		temparray[n] = s;
	    if (n > index)
		temparray[n] = data[n-1];
	}
	data = temparray;
    }

    public int size(){
	//returns # of items in list (not array size)
	int result = 0;
	for (int i=0; i<data.length; i++) {
	    if (data[i] != null)
		result++;
	}
	return result;
    }

    public String get(int index){
	//returns item at location index of the list
	return data[index];
    }

    public String set(int index, String s){
	//sets item at location index to value s, returns old value
        String result = data[index];
	data[index] = s;
	return result;
    }

    public String remove(int index){
	//must shift things over
	//removes item at index i, returns old value
	/*int result = data[index];
	data[index] = 0;
	return result;*/

	String result = data[index];
	String[] newarray = new String[data.length-1];
	for (int i=0; i<newarray.length; i++){
	    if (i<index)
		newarray[i] = data[i];
	    else
		newarray[i] = data[i+1];
	}
	return result;
    }

    public void test(int index, int i){
	if (index > size()-1){
	    throw new ArithmeticException();
	}
    }

    public String tostring(){
	String s = "";
	for (int i=0; i<data.length; i++){
	    s = s + " element " + i + " is " +  data[i] + "\n";
	}
	return s;	    
    }

    public void isort(){          //***
	String word1;
	for (int q=0; q<size(); q++){
	    word1 = data[q];
	    int i;
	    for (i=data.length-1; i>0 && word1.compareTo(data[i])<0; i--){

		data[i] = data[i-1];
	    }
	    data[i] = word1;
	}

    }

    public void ssort(){
	String  min;
	int minspot;
	for (int i=0; i<data.length; i++){
	    min = data[i];
	    minspot = i;
	    for (int q=i; q<data.length; q++){
		if (data[q].compareTo(min) < 0){
		    min = data[q];
		    minspot = q;
		}
	    }
	    if (min.compareTo(data[i]) < 0){
		data[minspot] = data[i];
		data[i] = min;
	    }
	}
    }

    public void bsort(){
	String word1;
	String word2;
	for (int q=0; q<data.length; q++){
	    for (int i=0; i<data.length-1; i++){
		word1 = data[i];
		word2 = data[i+1];
		if (word2.compareTo(word1) < 0){
		    data[i] = word2;
		    data[i+1] = word1;
		}
	    }
	}

	/*for (int i=0; i<data.length; i++){
	    word1 = data[i];
	    word2 = data[i+1];
	    if (word2.compareTo(word1) < 0){
		for (int q=i; q<data.length-1; q++){
		    word1 = data[q];
		    word2 = data[q+1];
		    if (word2.compareTo(word1) < 0){
			data[q] = word2;
			data[q+1] = word1;
		    }
		    else
			break;
		}
		i--;
	    }*/
    }

    public static void main (String args[]){
	Sarray as = new Sarray();
       	as.add("alice");
	as.add("caitlin");
	as.add("new");
	as.add("politics");
	as.add("bad");
	as.add("suns");
	as.add("somekindawonderful");
	as.add("lolo");
	as.add("woohoo");
	as.add(0,"chyeah");
	System.out.println("Initial Array:");
	System.out.print(as.tostring());
	System.out.print("Size is " + as.size() + "\n \n");

	//	as.isort();
	//	as.ssort();
	//	as.bsort();
	System.out.println("New:");
	System.out.print(as.tostring());
	/*	as.remove(3);
	as.remove(6);
	as.add(34);
	as.add(98);
	as.add(100);
	as.add(10,3);
	as.add(2,38);
	System.out.println("New Array:");
	System.out.print(as.tostring());
	System.out.print("Size is " + as.size() + "\n \n");

	try {
	    as.test(1,45);
	    as.add(1,45);
	    as.test(2,5);
	    as.add(2,5);
	    as.test(3,8);
	    as.add(3,8);
	    as.test(11,23);
	    as.add(11,23);
	    as.test(12,10);
	    as.add(12,10);
	    as.test(9,32);
	    as.add(9,32);
	    as.test(10,101);
	    as.add(10,101);
	    System.out.println("Newest Array:");
	    System.out.print(as.tostring());
	    System.out.print("Size is " + as.size() + "\n \n");
	}
	catch (ArithmeticException e){
	    System.out.println("Arithmetic error");
	}
    
	try {
	    as.test(67,4);
	    as.add(67,4);
	    System.out.println("Newest-est Array:");
	    System.out.print(as.tostring());
	    System.out.print("Size is " + as.size() + "\n \n");
	}
	catch (ArithmeticException e){
	    System.out.println("Arithmetic error while making Newest-est Array");
		}
	*/
    }
}

  
