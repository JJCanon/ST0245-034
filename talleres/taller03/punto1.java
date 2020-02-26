class punto1{
  public static void main(String[] args) {
    int n=3;
    punto1(n, 1, 2, 3);
  }

  public static void punto1(int n, int origen, int medio, int destino){
     if(n==1){
        System.out.println("Disco de " + origen + " a " + destino);
     }  
    else{
      punto1(n-1, origen, destino, medio);
      System.out.println("Disco de "+ origen + " a " + destino);
      punto1(n-1, medio, origen, destino);
    }
  }

}