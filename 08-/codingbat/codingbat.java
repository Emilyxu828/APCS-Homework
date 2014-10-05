public class codingbat {
  public String stringSplosion(String str) {
    String bubbles = "";
    int i = 0;
    /*while (i < str.length()+1) {
      bubbles = bubbles + str.substring(0,i);
      i = i+1;
    }
    */  
    for (i=0; i<str.length()+1; i++)
      bubbles = bubbles + str.substring(0,i);
    return bubbles;
  }

  public String stringX(String str) {
    String tmnt = "";
    for (int i=0; i<str.length(); i=i+1) {
      if (i==0 && str.substring(0,1).equals("x"))
        tmnt = "x";
      else if (i==str.length()-1 && str.substring(str.length()-1).equals("x"))
        tmnt = tmnt + "x";
      else if (str.substring(i,i+1).equals("x"))
        tmnt = tmnt;
      else
        tmnt = tmnt + str.substring(i,i+1);
    }
    return tmnt;
  }

}
