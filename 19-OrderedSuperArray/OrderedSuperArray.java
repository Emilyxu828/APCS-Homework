public class OrderedSuperArray extends Sarray {

    public boolean add(String e){
	if (size() == 0) {
	    super.add(e);
	} else if (e.compareTo(get(size() - 1)) > 0) {
	    add(size(), e);
	} else {
	    for (int i=0; i<size(); i++){
		if (e.compareTo(get(i))<0){
		    add(i,e);
		    break;
		}
	    }
	}
	return true;
    }

    public String set(int index, String s){
	String result = get(index);
	super.remove(index);
	add(s);
	return result;
    }
    
    public static void main (String[] args){
	OrderedSuperArray osa = new OrderedSuperArray();
	Sarray sa = new Sarray();
        osa.add("aisforapple");
	osa.add("bisforbanana");
	osa.add("z");
	osa.add("x");
	System.out.println("Initial Ordered Array:");
       	System.out.println(osa.tostring());

	osa.set(0,"eisforomelette");
	osa.set(3,"whaddappp");
	System.out.println("New Ordered Array:");
	System.out.println(osa.tostring());
    }
}



/*
 public void add(String e){
	String thisword;
	for (int i=0; i<OrderedSuperArray.size(); i++){
	    thisword = OrderedSuperArray.get(i);
	    if (int(e[i]<int(thisword[i])
Ordered
	    break;
	    for (int q=0; q<thisword.get(i).length(); q++){
		if (int(e[q])<int(thisword[q])     //e[i].compareTo(thisword[i])


    }
*/
