class taller5{
  public static void main(String[] args) {
    int[] arr1 = {1,2,3,4}; 
    punto1(arr1);
    int a=punto2(arr1);
    System.out.println(a);
    punto3(2);
  }
  public static void punto1(int arr[])  {  
    int aux; 
    int n=arr.length; 
    for (int i = 1; i < n; i++) {  
      aux = arr[i];  
      int j = i - 1;  
      while ( j >= 0 && arr[j] > aux) {  
        arr[j + 1] = arr[j];  
        j = j - 1;  
        }  
        arr[j + 1] = aux;  
    }
    for(int a=0;a<arr.length;a++){
      System.out.println(arr[a]);
    }  
  }

  public static int punto2(int arr[]){
    int n= arr.length;
    int aux=0;
    int res=0;
    for(int i=0; i <n ; i++){
      aux=arr[i];
      res=res+aux;
    }
    return res;
  }  

  public static void punto3(int n){
    for (int i=1;i <= n;i++){
      for(int j=1;j<=10;j++){
        System.out.println(i+" * "+ j+" = "+(i*j));
      }
    }
  }
}