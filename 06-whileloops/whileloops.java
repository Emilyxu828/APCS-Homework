public class whileloops {
  public String frontTimes(String str, int n) {
    int i = 0;
    String styro = "";
    if (str.length()<3)
      styro = str;
    else {
      while (i<3) {
        styro = styro + str.substring(i, i+1);
        i = i + 1;
      }
    }
    String foam = "";
    while (n>0) {
      foam = foam + styro;
      n = n-1;
    }
    return foam;
    }
  // took 10 minutes

  public String stringBits(String str) {
    String f = "";
    int i = 0;
    while (i < str.length()) {
      f = f + str.substring(i, i+1);
      i = i + 2; 
    }
    return f;
  }
  // took 5 minutes

  public String stringYak(String str) {
    String e = "";
    int i = 0;
    while (i < str.length()) {
      if (str.substring(i, i+1).equals("y") && i<str.length()-2) {
        if (str.substring(i, i+3).equals("yak")) 
          i = i+3;
        else {
          e = e + str.substring(i, i+1);
          i = i + 1;
        }
      }
      else {
        e = e + str.substring(i, i+1);
        i = i + 1;
      }
    }
    return e;
  }
  // took 20 minutes

  public int stringMatch(String a, String b) {
    int i = 0;
    int u = 0;
    String sm = "";
    if (a.length() < b.length())
      sm = a;
    else
      sm = b;
    while (i < sm.length()-1) {
      if (a.substring(i, i+2).equals(b.substring(i, i+2))) {
        u = u + 1;
        i = i + 1;
      }
      else
        i = i+1;
    }
    return u;
  }
  // took 10 minutes

}
