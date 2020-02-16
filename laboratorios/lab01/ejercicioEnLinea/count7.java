public int count7(int n) {
  int total7=0;
  if (n<7)return 0;
  else
  {
    if(n%10==7) total7++;
    total7+= count7(n/10);
  }
  return total7;
}

