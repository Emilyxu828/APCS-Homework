public class Shapes2 {
  public String frame(int r, int c){
    //Top Part
    String top = "";
    for (int t=0; t<c; t++)
      top = top + "*";
    top = top + "\n";

    //Middle Part  
	//Line
    String middleline = "";
    for (int ml=1; ml<c-1; ml++)
      middleline = middleline + " ";
    middleline = "*" + middleline + "*" + "\n";
	//Whole
    String middle = "";
    for (int m=0; m<r-2; m++)
      middle = middle + middleline;
  
    //Bottom Part
    String bottom = "";
    for (int b=0; b<c; b++)
      bottom = bottom + "*";
    
    return top + middle + bottom;  
 
	/*
	frame(5,4)

	* * * *
	* _ _ *
	* _ _ *
	* _ _ *
	* * * *
	*/
  }
}
