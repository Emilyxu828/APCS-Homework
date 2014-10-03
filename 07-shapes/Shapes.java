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
   public String tri3(int h){
	int a = 1;
	int b = 1;
        int c = h;
	int i = 0;
	int j = 0;
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
            i = j;
	    while (i > 0) {
		stars = stars + "*";
		i = i-1;
            }	
	    j = j + 1;
	    stars = stars + "\n";
	    a = a + 1;
	}
	return stars;

/*
tri3(4)
_ _ _ * _ _ _    
_ _ * * * _ _
_ * * * * * _
* * * * * * * 
*/
    }


    public String tri4(h) {
        int a = h;
	int b = h;
        int c = 1;
	int i = h;
	int j = h;
	String stars = "";
	while (a > 0) {
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
	    a = a - 1;
	}
	return stars;
    }


    public String diamond(int h){
	// Top Half, including middle
	int a = 1;
	int b = 1;
	int n = (h+1)/2;
        int c = n;
	int i = 0;
	int j = 0;
	String stars = "";
	while (a <= n) {
	    b = a;
            c = n - a;
            while (c > 0) {
                stars = stars + " ";
                c = c-1;
            }
	    while (b > 0) {
                stars = stars + "*";
		b = b - 1;
	    }
            i = j;
	    while (i > 0) {
		stars = stars + "*";
		i = i-1;
            }	
	    j = j + 1;
	    stars = stars + "\n";
	    a = a + 1;
	}

        // Bottom Half
	n = (h)/2;
        a = n;
	b = n;
        c = 1;
	i = n;
	j = n;
	stars = stars;
	while (a > 0) {
	    b = a;
            c = n - a;
            while (c > 0) {
                stars = stars + " ";
                c = c-1;
            }
	    while (b > 0) {
                stars = stars + "*";
		b = b - 1;
            }	
	    i = j;
	    while (i > 1) {
		stars = stars + "*";
		i = i-1;
	    }
	    j = j - 1;
	    stars = stars + "\n";
	    a = a - 1;
	}
	return stars;

/*
_ _ * _ _           tri3(3), diamond(5)
_ * * * _	    tri3 *2 -1 = diamond
* * * * *	    (diamond+1)/2 = tri3
_ * * * _
_ _ * _ _


_ * _               tri(2), diamond(3)
* * *
_ * _

_ _ _ * _ _ _ 
_ _ * * * _ _
_ * * * * * _
* * * * * * *	    tri3(4), diamond(70
_ * * * * * _
_ _ * * * _ _
_ _ _ * _ _ _


 public String tri3oppose(int h){ 
	int n = (h)/2;
        int a = n;
	int b = n;
        int c = 1;
	int i = n;
	int j = n;
	String stars = "";
	while (a > 0) {
	    b = a;
            c = n - a;
            while (c > 0) {
                stars = stars + " ";
                c = c-1;
            }
	    while (b > 0) {
                stars = stars + "*";
		b = b - 1;
            }	
	    i = j;
	    while (i > 1) {
		stars = stars + "*";
		i = i-1;
	    }
	    j = j - 1;
	    stars = stars + "\n";
	    a = a - 1;
	}
	return stars;


/*
_ _ _ _ *     a=1, b=1, c=4    n = 5     * * * *
_ _ _ * *     a=2, b=2, c=3		 _ * * *
_ _ * * *				 _ _ * *
_ * * * *				 _ _ _ *
* * * * *
*/
    }
  
      
}
