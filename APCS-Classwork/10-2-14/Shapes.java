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

    /* My Homework

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



    public String tri1(int h){
  	String s = "";
	int i = 0;
	int j;
	while (i<=h) {
	    j = 0;
	    while (j<i) {
		s = s + "*";
		j++;
	    }
	    s = s + "\n";
	    i++;
	}
	return s;
    }

    public String tri2(int h){
	int row = 0;
	int i;
	String s = "";
	while (row<h) {  //?
	    // space part
	    i=o;
	    while (i < h-row-1){
		s =s + " ";
		i++;
	    }

	    // stars part
	    i=0;
	    while (i<row+1) {
		s = s +"*";
		i++;
	    }
	    s = s+ "\n";
	    row++;
	}
        return s;
    }


    public String tri3(int h){

    }


    public string diamond(int h){
	String s = tri3((h+1)/2);
	int r;
        for (r=h-2; r>=0; r--){
	    for (int i=0; 1<h-r-2; i++){
		s=s+".";
	    }
	    for (int i=0; i<2*r-1; i++){
		s=s+"*";
	    }
	    s=s+"\n";
	}
	return s;
    }
}
