public boolean sleepIn(boolean weekday, boolean vacation) {
  if (weekday == true && vacation == true)
    return true;
  else if (weekday == true && vacation == false)
    return false;
  else if (weekday == false && vacation == true)
    return true;
  else
    return true;
}

public int diff21(int n) {
  if (21>n)
    return 21-n;
  else
    return 2*(n-21);
}

public String missingChar(String str, int n) {
  String f = str.substring(0,n) + str.substring(n+1);
  return f;
}

public String backAround(String str) {
  int a = str.length();
  String b = str.substring(a-1) + str.substring(0) +str.substring(a-1);
  return b;
}

public boolean startHi(String str) {
  if (str.length() < 2)
    return false;
  else
    return (str.substring(0,2).equals("hi"));
}

public boolean hasTeen(int a, int b, int c) {
  if (a>= 13 && a<=19)
    return true;
  else if (b>=13 && b<=19)
    return true;
  else if (c>=13 && c<=19)
    return true;
  else
    return false;
}

public int close10(int a, int b) {
  int c = Math.abs(10-a);
  int d = Math.abs(10-b);
  if (c<d)
    return a;
  else if (c>d)
    return b;
  else
    return 0;
}

public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  return (aSmile == bSmile);
}

public boolean parrotTrouble(boolean talking, int hour) {
  return (talking == true && (hour<7 || hour>20));
}

public boolean posNeg(int a, int b, boolean negative) {
  if (negative == true)
     return (a<0 && b<0);
  else
     return ((a>0 && b<0) || (a<0 &&b>0));
  
}

public String frontBack(String str) {
  if (str.length() < 2)
    return str;
  else {
    String front = str.substring(0,1);
    String back = str.substring(str.length()-1);
    String middle = str. substring(1,str.length()-1);
    String fin = back + middle + front;
    return fin;
  }
}

public boolean or35(int n) {
  return (n%3 == 0 || n%5 == 0);
}

public boolean icyHot(int temp1, int temp2) {
  return ((temp1<0 && temp2>100) || (temp1>0 && temp2<100));
}

public boolean loneTeen(int a, int b) {
  if ((a>=13 && a<=19) && (b>=13 &&  b<=19))
    return false;
  else if ((a<13 || a>19) && (b<13 || b>19))
    return false;
  else
    return true;
}

public String startOz(String str) {
  String f = "";
  if (str.length()>0) {
    if (str.substring(0,1).equals("o"))
       f = "o";
  }
  if (str.length()>1) {
    if (str.substring(1,2).equals("z"))
      f = f + "z";
  }
  return f;
}

public boolean in3050(int a, int b) {
  return (((a>=30 && a<=40) && (b>=30 && b<=40)) || ((a>=40 && a<=50) && (b>=40 && b<=50)));
}

public boolean makes10(int a, int b) {
  if (a==10 || b==10)
    return true;
  else if (a+b == 10)
    return true;
  else
    return false;
}

public String notString(String str) {
  String f = "";
  if (str.length() < 3)
    f = "not " + str;
  else {
    if (str.substring(0,3).equals("not"))
      f = str;
    else
      f = "not " + str;
  }
  return f;
}

public String front3(String str) {
  String q = "";
  if (str.length()<3)
    q = str + str + str;
  else {
    String w = str.substring(0,3);
    q = w + w + w;
  }
  return q;
}

public String front22(String str) {
  String b = "";
  if (str.length()>1) {
    String d = str.substring(0,2);
    b = d + str + d;
  }
  else
    b = str + str + str;
  return b;
}

public boolean in1020(int a, int b) {
  return ((a>=10 && a<=20) || (b>=10 && b<=20));
}

public String delDel(String str) {
  String x = "";
  if (str.length()>4) {
    if (str.substring(1,4).equals("del"))
      x = str.substring(0,1) + str.substring(4);
    else 
      x = str;
  }
  else if (str.length()==4) {
    if (str. substring(1,4).equals("del"))
      x = str.substring(0,1);
    else
      x = str;
  }
  else
    x = str;
  return x;
}
   
public int intMax(int a, int b, int c) {
  if ((a>b||a==b) && (a>c||a==c)) 
    return a;
  else if ((b>a||b==a) && (b>c||b==c))
    return b;
  else
    return c;
}

public int max1020(int a, int b) {
  if ((a>=10 && a<=20) && (b>=10 && b<=20)){
    if (a>=b)
      return a;
    else
      return b;
    }
  else if ((a>=10 && a<=20) && (b<10 || b>20))
    return a;
  
  else if ((a<10 || a>20) && (b>=10 && b<=20))
    return b;
  else
    return 0;
}

public String endUp(String str) {
  int k = str.length() - 3;
  String j = "";
  if (str.length() > 2){
    String s = str.substring(k);
    j = str.substring(0,k) + s.toUpperCase();
    }
  else if (str.length() == 0)
    j = str;
  else
    j = str.toUpperCase();
  return j;
}

