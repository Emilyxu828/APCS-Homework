/**
 * Creates a word search puzzle
 *
 */

import java.util.*;
import java.io.*;

public class WordSearch{
    
    private char[][] board;
    
    public WordSearch(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
	
    }
    public WordSearch(){
	this(20,30);
    }
    
    public String toString(){
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j] + " ";
	    }
	    s = s + "\n";
	}
	return s;
    }

    public String reverseString(String s) {
	String news = "";
	for (int i=s.length()-1; i>=0; i--) {
	    news += s.substring(i,i+1);
	}
	return s;
    }
    
    public boolean addWordHTest(String word, int row, int col, char direction) {
	int r = row, c = col;
	String w = word;
	int lastIndex = w.length()-1;
	boolean shouldAdd = true;
	try{
	    for (int i=0; i<w.length(); i++){
		if (board[r][c] != w.charAt(i) && board[r][c] != '.'){
		    shouldAdd = false;
		    break;
		}
		if (direction == 'l')
		    c = c - 1;
		if (direction == 'r')
		    c = c + 1;
	    }
	}
	catch (Exception e){
	    shouldAdd = false;
	}
	return shouldAdd;
    }
    
    public void addWordH(String word,int row, int col, char direction){
	int r = row, c = col;
	String w = word;
        boolean add = true;
        int lastIndex = w.length()-1;
        if (addWordHTest(w, r, c, direction) == true) {
	    for (int i = 0; i < w.length(); i++) {
	        board[r][c] = w.charAt(i);
	        if (direction == 'l') {
		    c--;
		}
	        if (direction == 'r') {
		    c++;
		}
	    } 
	}
    }
    
    public boolean addWordVTest(String word, int row, int col, char direction) {
	int r = row, c = col;
	String w = word;
	int lastIndex = w.length() - 1;
	boolean shouldAdd = true;
	try {
	    for (int i=0; i<w.length(); i++){
		if (board[r][c] != w.charAt(i) && board[r][c] != '.'){
		    shouldAdd = false;
		    break;
	        }
		if (direction == 'u')
		    r = r - 1;
		if (direction == 'd')
		    r = r + 1;
	    }
	}
	catch (Exception e){
	    shouldAdd = false;
	}
	return shouldAdd;
    }

    public void addWordV(String word,int row, int col, char direction){
	int r = row, c = col;
	String w = word;
        boolean add = true;
	int lastIndex = w.length() - 1;
	if (addWordVTest(w, r, c, direction) == true) {
	    for (int i = 0; i < w.length(); i++) {
		board[r][c] = w.charAt(i);
		if (direction == 'u') {
		    r--;
	        }
		if (direction == 'd') {
		    r++;
		}
	    } 
	}
    }

    public boolean addWordDUpTest(String word, int row, int col, char direction) {
	int r = row, c = col;
	String w = word;
	int lastIndex = w.length() - 1;
	boolean shouldAdd = true;
	try {
	    for (int i=0; i<w.length(); i++){
		if (board[r][c] != w.charAt(i) && board[r][c] != '.'){
		    shouldAdd = false;
		    break;
		}
		if (direction == 'l'){
		    r = r - 1;
		    c = c - 1;
		}
		if (direction == 'r'){
		    r = r - 1;
		    c = c + 1;
		}
	    }
	}
	catch (Exception e){
	    shouldAdd = false;
	}
	return shouldAdd;
    }

    public void addWordDUp(String word,int row, int col, char direction){
	int r = row, c = col;
	String w = word;
        boolean add = true;
        int lastIndex = w.length() - 1;
	if (addWordDUpTest(w, r, c, direction) == true) {
	    for (int i = 0; i < w.length(); i++) {
	        board[r][c] = w.charAt(i);
		if (direction == 'l') {
		    c++;
		    r++;
	        }
		if (direction == 'r') {
		    c++;
		    r--;
		}
	    }  
	}
    }
    public boolean addWordDDownTest(String word, int row, int col, char direction) {
	int r = row, c = col;
	String w = word;
	int lastIndex = w.length() - 1;
	boolean shouldAdd = true;
	try {
	    for (int i=0; i<w.length(); i++){
		if (board[r][c] != w.charAt(i) && board[r][c] != '.'){
		    shouldAdd = false;
		    break;
		}
		if (direction == 'l'){
		    r = r + 1;
		    c = c - 1;
		}
		if (direction == 'r'){
		    r = r + 1;
		    c = c + 1;
		}
	    }
	}
	catch (Exception e){
	    shouldAdd = false;
	}
	return shouldAdd;
    }

    public void addWordDDown(String word,int row, int col, char direction){
	int r = row, c = col;
	String w = word;
        boolean add = true;
	int lastIndex = w.length() - 1;
	if (addWordDDownTest(w, r, c, direction) == true) {
	    for (int i = 0; i < w.length(); i++) {
		board[r][c] = w.charAt(i);
		if (direction == 'l') {
		    c++;
		    r--;
		}
		if (direction == 'r') {
		    c++;
		    r++;
		}
	    }
	}  
    }


    public boolean addWord(String w){
	Random rand = new Random();
	int r, c;
	boolean canaddword = false;
	int addway;
	int dir;
	char facing = '_';
	while (canaddword == false){
	    r = rand.nextInt(board.length);
	    c = rand.nextInt(board[1].length);
	    addway = rand.nextInt(4);
	    dir = rand.nextInt(2);
	    if (addway == 0){
		if (dir == 0)
		    facing = 'l';
		else 
		    facing = 'r';
		addWordH(w, r, c, facing);
		canaddword = addWordHTest(w, r, c, facing);
	    }
	    if (addway == 1){
		if (dir == 0)
		    facing = 'u';
		else
		    facing = 'd';
		addWordV(w, r, c, facing);
		canaddword = addWordVTest(w, r, c, facing);
	    }
	    if (addway == 2){
		if (dir == 0)
		    facing = 'l';
		else
		    facing = 'r';
		addWordDUp(w, r, c, facing);
		canaddword = addWordDUpTest(w, r, c, facing);
	    }
	    else {
		if (dir == 0)
		    facing = 'l';
		else
		    facing = 'r';
		addWordDDown(w, r, c, facing);
		canaddword = addWordDDownTest(w, r, c, facing);
	    }
	}
	return canaddword;
    }

    public void fillboard(){
	char[] letters = {'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};
	Random rand = new Random();
	int y;
	for (int i=0; i<board.length; i++){
	    for (int q=0; q<board[1].length; q++){
		if (board[i][q] == '.'){
		    y = rand.nextInt(26);
		    board[i][q] = letters[y];
		}
	    }
	}
    }

    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println("Blank Board: ");
	System.out.println(w);

	Scanner sc=null;
	try {
	    sc = new Scanner(new File("words.txt"));
      	} catch (Exception e) {
	    System.out.println("Can't open file");
	    System.exit(0);
	}
       	while (sc.hasNext()) {
	    String s = sc.next();
	    w.addWord(s);
        }

	System.out.println("List of Words: hippo, lamborghini, scissors, bubbles, triangle \n");

	System.out.println("After Adding: ");
	System.out.println(w);

	w.fillboard();
	System.out.println("Completed Board: ");
	System.out.println(w);

    }
}
