public String helloName(String name) {
  return "Hello "+name+"!";
}

public String theEnd(String str, boolean front) {
  int l = str.length();
  if (front == false)
    return (str.substring(l-1));
  else
    return str.substring(0,1);
}

public boolean endsLy(String str) {
  int l = str.length();
  if (l>1)
    return (str.substring(l-2).equals("ly"));
  else
    return false;
}

  int f = str.length();
  int y = (f-1)/2;
  return str.substring(y-1, y+2);
  
}

public String lastChars(String a, String b) {
  String A = "";
  String B = "";
  if (a.length()>0)
    A = a.substring(0,1);
  else
    A = "@";
  if (b.length()>0)
    B = b.substring(b.length()-1);
  else 
    B = "@";
  return A+B;
}

public String seeColor(String str) {
  String v = "";
  if (str.length()<3)
    v = v;
  if (str.length()>2) {
    if (str.substring(0,3).equals("red"))
      v = "red";
    else if (str.substring(0,3).equals("blu")) {
      if (str.length()>3) {
        if (str.substring(0,4).equals("blue"))
          v = "blue";
        else
          v = v;
      }
      else
        v = v; 
    }
    else
      v = v;
  }     
  return v;
}

public String extraFront(String str) {
  String g = "";
  if (str.length()>1)
    g = str.substring(0,2)+str.substring(0,2)+str.substring(0,2);
  else
    g = str+str+str;
  return g;
}

public String startWord(String str, String word) {
  int e = word.length();
  int w = str.length();
  if (w==0 || w<e)
    return "";
  if (e==1)
    return str.substring(0,1);
  else {
    if (word.substring(1,e).equals(str.substring(1,e)))
      return str.substring(0,e);
    else 
      return "";
  }
}

public String extraEnd(String str) {
  String b = (str.substring(str.length()-2));
  return b+b+b;
}

public String withoutEnd(String str) {
  int n = str.length();
  String c = str.substring(1, n-1);
  return c;
}

public String left2(String str) {
  int h = str.length();
  String k = "";
  if (h==2)
    k = str;
  else
    k = str.substring(2,h) + str.substring(0,2);
  return k;
}

public String withouEnd2(String str) {
  String d = "";
  int s = str.length();
  if (s==0 || s==1 || s==2)
    d = "";
  else
    d = str.substring(1,s-1);
  return d;
}

public String nTwice(String str, int n) {
  int d = str.length();
  String o = str.substring(0,n) + str.substring(d-n);
  return o;
}

public boolean hasBad(String str) {
  int m = str.length();
  if (m<3)
    return false;
  else if (m==3)
    return str.equals("bad");
  else 
    return (str.substring(0,3).equals("bad")||str.substring(1,4).equals(
   "bad"));
}

public String conCat(String a, String b) {
  int A = a.length();
  int B = b.length();
  String conc = "";
  if (A == 0 || B == 0)
    conc = a+b;
  else {
    if  (a.substring(A-1).equals(b.substring(0,1)))
      conc = a + b.substring(1);
    else 
      conc = a + b;
    }
  return conc;
}

public boolean frontAgain(String str) {
  int g = str.length();
  if (g>=2)
    return str.substring(0,2).equals(str.substring(g-2));
  else
    return false;
}

public String without2(String str) {
  int x = str.length();
  if (x==0 || x==1)
    return str;
  else if (x==2)
    return "";
  else {
    if (str.substring(0,2).equals(str.substring(x-2)))
      return str.substring(2,x);
    else
      return str;
  }
}

  int w = str.length();
  String y = "";
  if (w==0)
    y = str;
  else if (w==1) {
    if (str.equals("x"))
      y = "";
    else 
      y = str;
    }
  else {
    if (str.substring(0,1).equals("x") && str.substring(w-1).equals("x"))
      y = str.substring(1, w-1);
    else if (str.substring(w-1).equals("x"))
      y = str.substring(0,w-1);
    else if (str.substring(0,1).equals("x"))
      y = str.substring(1);
    else
      y = str;
  }
  return y;    
}

public String makeTags(String tag, String word) {
  String u = "<" + tag + ">" + word + "</" + tag + ">";
  return u;  
}

public String firstTwo(String str) {
  int p = str.length();
  if (p<2)
   return str;
  else
   return str.substring(0,2);
}

public String comboString(String a, String b) {
  int A = a.length();
  int B = b.length();
  if (A<B)
    return a+b+a;
  else 
    return b+a+b;
}

public String right2(String str) {
  int t = str.length();
  if (t<=2)
    return str;
  else
    return str.substring(t-2) + str.substring(0,t-2);
}

public String middleTwo(String str) {
  int i = str.length();
  int mid1 = i/2-1;
  int mid2 = i/2;
  return str.substring(mid1,mid2+1);

public String twoChar(String str, int index) {
  int r = str.length();
  if (r<=index+1 || index<0)
    return str.substring(0,2);
  else
    return str.substring(index, index+2);
}

public String atFirst(String str) {
  int l = str.length();
  if (l==0)
    return "@@";
  else if (l==1)
    return str+"@";
  else 
    return str.substring(0,2);
}

public String lastTwo(String str) {
  int u = str.length();
  if (u<2)
    return str;
  if (u==2)
    return str.substring(1)+str.substring(0,1);
  else
    return str.substring(0, u-2) + str.substring(u-1) + str.substring(u-2, u-1);
}

public String minCat(String a, String b) {
  int A = a.length();
  int B = b.length();
  if (A<B)
    return a+b.substring(B-A);
  else if (A>B)
    return a.substring(A-B)+b;
  else
    return a+b;
}

  int c = str.length();
  String q = "";
  if (c==0)
    q = "";
  else if (c==1) {
    if (str.equals("a"))
      q = str;
    else
      q = "";
    }
  else {
    if (str.substring(0,2).equals("ab"))
      q = str;
    else if (str.substring(0,1).equals("a"))
      q = "a" + str.substring(2);
    else if (str.substring(1,2).equals("b"))
      q = "b" + str.substring(2);
    else
      q = str.substring(2);
    }
  return q;
}

public String withoutX2(String str) {
  int z = str.length();
  if (z==0)
    return "";
  else if (z==1) {
    if (str.equals("x"))
      return "";
    else
      return str;
    }
  else {
    if (str.substring(0,2).equals("xx"))
      return str.substring(2);
    else if (str.substring(0,1).equals("x"))
      return str.substring(1);
    else if (str.substring(1,2).equals("x"))
      return str.substring(0,1)+str.substring(2);
    else
      return str;
  }
}
