public boolean mixStart(String str) {
  if (str.length() <3){
     return false;
     }
  if (str.substring(1,3).equals("ix") ){
     return true;
     }
  else
     return false;
}


public String makeOutWord(String out, String word) {
  String n = "";
  n = out.substring(0,2);
  n = n + word;
  n = n + out.substring(2);
  return n;
}


public String firstHalf(String str) {
  int fulllength = str.length();
  int halflength = fulllength / 2;
  String half = str.substring(0, halflength);
  return half;
}
