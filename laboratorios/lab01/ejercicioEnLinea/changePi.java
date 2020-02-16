public String changePi(String str) {
  if(str.length()<2)
  return str;
  else
  {
    if(str.substring(0,2).equals("pi"))
    {
      str="3.14"+changePi(str.substring((str.length())-(str.length()-2)));
      
    }
    else
    str=str.substring(0,1)+changePi(str.substring(str.length()-(str.length()-1)));
  }
  return str;
}
