public int countX(String str) {
  int contador=0;
  if(str.length()==0) return 0;
  else
  {
    if(str.substring(0,1).equals("x"))
    {
      contador+= 1+countX(str.substring(str.length()-(str.length()-1)));
    }
    else contador+= 0+countX(str.substring(str.length()-(str.length()-1)));
  }
  return contador;
}
