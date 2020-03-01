public int[] seriesUp(int n) {
  int a=0;
  for(int i=n;i>0;i--)
  {
    a+=i;
  }
  int[] arr = new int[a];
  int max = n;
  int lim = 1;
  int m = 1;
  for(int j=0; j<a; j++)
  {
    arr[j]=m;
    m+=1;
    if(m>lim){m=1; lim++;}
  }
  return arr;
}
