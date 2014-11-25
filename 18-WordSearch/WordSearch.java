/**
 * Creates a word search puzzle
 * 
 */

public class WordSearch{

    private char[][] board;

    public WordSearch(int r, int c){
	board = new char[r][c];
	for (int i=0; i<board.length; i++){
	    for (int j=0; j<board[i].length; j++){
		board[i][j]='.';
	    }
	}
    }
    public WordSearch(){
	this(20,30);
    }

    public String toString(){
	String s = "";
	for (int i=0; i<board.length; i++){
	    for (int j=0; j<board[i].length; j++){
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }

    public boolean checkaddWordH(String w, int row, int col){
	int r = row, c = col;


    public void addWordH(String w, int row, int col){
	int r  =row, c = col;
	if (row>=board.length || col>=board[1].length)
	    System.out.println("Row or Column is too big for placement of " +w); 
	else {
	    if (board[1].length-col >= w.length()){
		for (int i=0;i<w.length();i++){
		    if (board[r][c]=='.' || board[r][c]==w.charAt(i)){
		        board[r][c] = w.charAt(i);
		        c++;
		    }
		    else {
			int temp = c;
			System.out.println("Error in overlapping letter(s) during placement of " + w);
			c=col;
			for (int m=0; m<w.length();m++){
			    if (c != temp){
				board[r][c] = '.';
				c++;
			    }
			}
		    }
		}
	    }
	    else 
		System.out.println("Can't place " +w+ " here");
	}
	
    }

    public void addWordHback(String w, int row, int col){
	String u="";
        for (int d=0; d<w.length(); d++)
            u = w.substring(d,d+1) + u;}
        w = u;
	int r  =row, c = col;
	if (row>=board.length || col>=board[1].length)
	    System.out.println("Row or Column is too big for placement of " +w); 
	else {
	    if (board[1].length-col >= w.length()){
		for (int i=0;i<w.length();i++){
		    if (board[r][c]=='.' || board[r][c]==w.charAt(i)){
		        board[r][c] = w.charAt(i);
		        c++;
		    }
		    else {
			int temp = c;
			System.out.println("Error in overlapping letter(s) during placement of " + w);
			c=col;
			for (int m=0; m<w.length();m++){
			    if (c != temp){
				board[r][c] = '.';
				c++;
			    }
			}
		    }
		}
	    }
	    else 
		System.out.println("Can't place " +w+ " here");
	}
	
    }


    public void addWordV(String w, int row, int col){
	int r  =row, c = col;
	if (row>=board.length || col>=board[1].length)
	    System.out.println("Row or Column Entered is too big for placement of " ); 
	else{
	    if (board.length-row >= w.length()){
		for (int i=0;i<w.length();i++){
		    if(board[r][c]=='.' || board[r][c]==w.charAt(i)){
		         board[r][c] = w.charAt(i);
		         r++;
                }
                else {
                    int temp = c;
                    System.out.println("Error in overlapping letter(s) during placement of " + w);
                    r=row;
                    for (int m=0; m<w.length();m++){
                         if (r != temp){
                             board[r][c] = '.';
                             r++;
                        }
                    }
                }
		}
	    }
	    else 
		System.out.println("Can't place " +w+ " here");
	}
    }

    public void addWordVback(String w, int row, int col){
        String u="";
        for (int d=0; d<w.length(); d++){
            u = w.substring(d,d+1) + u;
        }
        w = u;
	int r  =row, c = col;
	if (row>=board.length || col>=board[1].length)
	    System.out.println("Row or Column Entered is too big for placement of " ); 
	else{
	    if (board.length-row >= w.length()){
		for (int i=0;i<w.length();i++){
		    if(board[r][c]=='.' || board[r][c]==w.charAt(i)){
		         board[r][c] = w.charAt(i);
		         r++;
                }
                else {
                    int temp = c;
                    System.out.println("Error in overlapping letter(s) during placement of " + w);
                    r=row;
                    for (int m=0; m<w.length();m++){
                         if (r != temp){
                             board[r][c] = '.';
                             r++;
                        }
                    }
                }
		}
	    }
	    else 
		System.out.println("Can't place " +w+ " here");
	}
    }

    public static void main (String[] args){
	WordSearch w = new WordSearch();

        System.out.println(w);
	w.addWordH("hello",3,5);
       	w.addWordH("look",3,7);
       	w.addWordH("puppies",3,15);
    	w.addWordV("yolo",14,2);
        w.addWordH("word", 17,1);
    	w.addWordV("qwerty",1,14);
	w.addWordH("hello",100,5);
      	w.addWordH("hello",30,555);
	w.addWordHback("swag",13,15);
        w.addWordVback("cheesey",11,18);
				
	System.out.println(w);
    }
}
