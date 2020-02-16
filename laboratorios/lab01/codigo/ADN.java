public class ADN
{
 
  public int adn(String x, String y)
  {
    int longitud = 0;
    String[] cadena1 = x.split("");
    String[] cadena2 = y.split("");
    for(int i = 0; i<x.lenght();i++)
    {
      String a = cadena1[i];
      for(int j = 0; j<y.length();j++)
      {
        if (a.equalsIngoreCase(cadena2[j]))
        {
         longitud++;
         cadena2[j]=Integer.toString(j);
        }
      }
    }
    return longitud;
  }
}
