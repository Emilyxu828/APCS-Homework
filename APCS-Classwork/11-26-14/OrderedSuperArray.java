public class OrderedSuperArray extends Sarray {

    public void oadd(String e){
	for (int i=0; i<size(); i++){
	    if (e.compareTo(get(i))<0){
		super.add(i,e);
	    }
	}
    }
    public String tostring(){
	return super.tostring();
    }

    public static void main (String[] args){
	OrderedSuperArray osa = new OrderedSuperArray();
	Sarray sa = new Sarray();
	osa.oadd("a");
	osa.oadd("b");
	osa.oadd("z");
	osa.oadd("x");
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
