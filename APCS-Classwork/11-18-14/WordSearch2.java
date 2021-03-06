/**
 * Creates a word search puzzle
 *
 */

import java.util.*;
import java.io.*;

public class WordSearch2{
    
    private char[][] board;
    
    public WordSearch2(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
	
    }
    public WordSearch2(){
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

    public static void main(String[] args) {
	WordSearch2 w = new WordSearch2();
	System.out.println("Blank Board: ");
	System.out.println(w);

	/*	w.addWordH("hello",3,12,'r');
	w.addWordH("look",3,15,'r');
	w.addWordH("bike",3,5,'r');
	w.addWordH("keylhpe",3,7,'r');
	w.addWordH("lemur",5,10,'r');
	w.addWordH("triangle",5,4,'r');
	w.addWordH("apple",7,7,'l');
	w.addWordH("pear",8,9,'l');
	w.addWordV("lion",7,4,'d');
	w.addWordV("hike",0,13,'d');
	w.addWordV("back",6,18,'u');
	//	w.addWordD("triangle",18,12,'c');
	//w.addWordH("hello",100,5);
	//w.addWordH("hello",30,555);
	*/

	w.addWord("hippo");
	w.addWord("lamborghini");
	w.addWord("scissors");
	w.addWord("bubbles");

	System.out.println("After Adding: ");
	System.out.println(w);
    }
}
