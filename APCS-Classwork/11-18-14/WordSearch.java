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

    public void addWordH(String w, int row, int col){
	int r  =row, c = col;
	if (row>board.length || col>board[1].length)
	    System.out.println("Row or Column is too big"); 
	if (board[1].length-col <= w.length()){
	    for (int i=0;i<w.length();i++){
		board[r][c] = w.charAt(i);
		c++;
	    }
	}
	else 
	    System.out.println("Can't place word here");
	
    }



    public static void main (String[] args){
	WordSearch w = new WordSearch();
       	System.out.println(w);
	w.addWordH("hello",3,5);
       	w.addWordH("look",3,8);
       	w.addWordH("look",3,5);
        w.addWordH("hello",100,5);
      	w.addWordH("hello",30,555);
				
	System.out.println(w);
    }
}
