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
		board[i][j]=".";
	    }
	}
    }
    public WordSearch(){
	WordSearch(30,20);
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
	for (int i=0; i<w.length(); i++){
	    for (int j=0; i<board.length; i++){
		board[i][j]='.';
	    }
	}
    }



    public static void main (String[] args){
    }
}
