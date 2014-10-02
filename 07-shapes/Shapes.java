public class Shapes {

    public String box(int r, int c){
	String s= "";
	int row = 0;
	int col;
	while (row<r){
	    col = c;
	    while (col>0){
		s = s + "*";
		col=col-1;
	    }
	    s=s+"\n";
	    row=row+1;
	}
	return s;
    }


    public String tri1(int h){
	int a = 0;
	int b = 0;
	String stars = "";
	while (a < h) {
	    b = a;
	    while (b >= 0) {
		stars = stars + "*";
		b = b - 1;	
	    }
	    stars = stars + "\n";
	    a = a + 1;
	}
	return stars;
   }


   public String tri2(int h){ 
        int a = 0;
	int b = 0;
	String stars = "";
	while (a < n) {
	    b = a;
	    while (b > 0) {
		stars = stars + " ";
		b = b - 1;
    	    }	
	    if (b = 0) {
		stars = stars + "*";
		b = b - 1;
	    }
	    stars = stars + "\n";
	    a = a + 1;
	}
	return stars;
   }
}
