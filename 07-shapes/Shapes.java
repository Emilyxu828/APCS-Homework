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
        int a = 1;
	int b = 1;
        int c = h;
	String stars = "";
	while (a <= h) {
	    b = a;
            c = h - a;
            while (c > 0) {
                stars = stars + " ";
                c = c-1;
            }
	    while (b > 0) {
                stars = stars + "*";
		b = b - 1;
            }	
	    stars = stars + "\n";
	    a = a + 1;
	}
	return stars;

/*
_ _ _ _ *     a=1, b=1, c=4             n = 5
_ _ _ * *     a=2, b=2, c=3
_ _ * * *
_ * * * *
* * * * *
*/
    }
    
      
}
