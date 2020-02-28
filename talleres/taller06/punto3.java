import java.util.ArrayList;

public class Punto3

    {
      ArrayList<Integer> lista = new ArrayList<>();

    public void punto3a(int n)
    {
        int cont=1;
        for(int i=0; i<n;i++)
        {
            for(int j=1;j<=cont;j++)
            {
                lista.add(j);
            }
            cont++;
        }
    }
    }
