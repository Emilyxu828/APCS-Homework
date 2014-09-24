public String nonStart(String a, String b) {
  String c = a.substring(1);
  String d = b.substring(1);
  String e = c+d;
  return e;
}


public String makeAbba(String a, String b) {
  return a+b+b+a;
}


public int diff21(int n) {
  if (21>n)
    return 21-n;
  else
    return 2*(n-21);
}

