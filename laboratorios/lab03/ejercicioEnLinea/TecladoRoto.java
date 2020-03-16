import java.io.BufferedReader; // 
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class TecladoRoto {

    public static void main (String [] abc) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;//String ingresado por el usuario

        while ((s=br.readLine())!=null) {//Mientras el String ingresado contenga algo se va a leer
            LinkedList<Character> value=new LinkedList<>(); //Lista enlada de tipo de caracteres 
            int pointerLocation=0;//Localizador del char del String
            for (char c : s.toCharArray()) {//UN char c que va a tener lo que contenga el String y su posicion 
                if (c=='[') pointerLocation=0;// Si en la posicion del char c dentro del String entonces el Localizador=0
                else if (c==']') pointerLocation=value.size();//Si no se cumple entonces el Puntero vale el tamaño en esa posicion 
                else value.add(pointerLocation++,c);// Si no se cumple tampoco  value(Lista enlazada) va a añadir el punto del localizador 
                                                     //incrementado en uno en uno y la posicion del char en ese moneto 
            }

            StringBuilder sb=new StringBuilder();// Un String Bulider llamado sb para hacer que se pueda modificar mas rapido 
            for (char c : value) sb.append(c); //char c a ser igual al valor agregado en Value y ademas sb va a añadir lo que contenga c
            System.out.println(sb.toString());//Imprime lo contenido en sb
        }
    }
}
