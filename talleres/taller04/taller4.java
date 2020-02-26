class taler4{
  public static void main(String[] args) {
    
    int[] arr ={12,324,43,2,3,43,2,3,43};
    int max=punto1(arr,0);
    System.out.println(max);
    int fib=punto3(8);
    System.out.println(fib);
  }

  public static int punto1(int t[], int n){
    int aux;
    if(n==t.length-1) {
    aux=t[n];
    }
    else{
      int a;
      a = punto1(t,n+1);
      if (t[n]>a){
        aux = t[n];     
      }else{
        aux = a; 
      }
    }
    return aux;
  }

  public static int punto3(int n) {
  if(n<=1){
    return n;
  }else{
    return punto3(n-2)+punto3(n-1);
  }
}
}