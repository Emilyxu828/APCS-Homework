public class Box {
    public String box(int a, int b) {
	int A = a;
	int B = b;
	String achoo = "";
	String woah = "";
	while (B > 0) {
	    achoo = achoo + "*";
	    B = B-1;
	}
	while (A > 0) {
	    woah = woah + achoo + "\n";
	    A = A - 1;
	}
	return woah;
    }
}


/*

given int r, int c

String s = "";
int row = 0;
int col;
while (row<r){
   col = c;
   while (col>0){
     s = s+"*";
     col = col-1;
   }
   s=s+"\n";
   row = row +1;
}
return s

*/
