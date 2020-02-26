public static int numRect(int n)
  {
    if(n<2)
    return n;
    else return numRect(n-1) + nemRect(n-2);
  }
