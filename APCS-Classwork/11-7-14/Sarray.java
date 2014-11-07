public Class Sarray {
    private int[] data;     
         //should be object[]
    private int last;

    public Sarray(){    
	//start array at size 10
	int[] intarray = new int[10];
    }

    /*--------- Methods ----------*/
    public add(int i){     
	//add to int
	for (int n; n<intarray.length; i++){
	    if (int[n ]== 0){
		int n = i;
		break;
	    }
	}
    }

    public void add(int index, int i){
	//add at location index, shift everything down
	if (data[index]==0)
	    data[index]=i;
	else {
	    for (int q=data.length-2; q>index; q--){
		data[q+1] = data[q];
	    }
    }

    public get(int index){
    }

    public void set(int index, int i){
    }

    public size(){
    }

    public remove(int index){
	//must shift things over
    }



    public tostring(){
	String s = "";
	for (int i=0; i<data.length; i++){
	    s = s + " element " + i + " is " +  data[i] + "\n";
	}
	    
}
    public static void main (String args[]){
    }
}
