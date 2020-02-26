class Main {
  public static void main(String [] args)
  {

  }
  public static void permutacion()
  {
    PermutacionesAUX("" , s);

    }
    private void PermutacionesAUX(String base, String s ){
        if(s.length()==0 ){
                System.out.println(base);
              //  AdvancedEncryptionStandard.desencriptarArchivo(base);
        }
        else{
            for (int i=0; i<s.length();i++){
                PermutacionesAUX(base+s.charAt(i),s.substring(0,i)+s.substring(i+1,s.length()));
            }
        }

    }
}
