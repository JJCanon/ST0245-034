/**
 * La clase Fecha tiene la intenci�n de representar el tipo abstracto fecha.
 * Aunque ya existen librer�as encargadas de esta funcion:
 * @see <a href="http://www.baeldung.com/java-8-date-time-intro"> Ver documentacion tipo Time </a>
 * En este ejercicio podemos tener una compresi�n m�s profunda de su funcionamiento interno.
 * 
 * @author Mauricio Toro, Andres Paez
 * @version 1
 */

public class Fecha {
    

    /*
    varibales con atributo final indican que una variable es de tipo 
    constante, es decir, no admitir� cambios despu�s de su declaraci�n y asignaci�n de valor.
    final determina que un atributo no puede ser sobreescrito o redefinido.
    Se le asigna esta caracter�stica para evitar que se sobrescriban valores.
    tener en cuenta tipado de las 3 variables!.
    */

    private final int dia;
    private final int mes;
    private final int anyo;


    /**
     * Se inicializan las variables globales en el constructor de manera que no posean valores nulos o 0s.
     */
    public Fecha() {
     this.dia = dia;
     this.mes = mes;
     this.anyo = anyo;
    }

    /**
     * M�todo para obtener la variable global dia.
     *
     * @return el dia
     */
    public int getDia() {
      return dia;
    }

    /**
     * M�todo para obtener la variable global mes.
     *
     * @return el mes
     */
    public int getMes() {
      return mes;
    }

    /**
     * M�todo para obtener la variable global anio.
     *
     * @return el a�o
     */
    public int getAnio() {
      return anyo;
    }

    /**
    * @param otra representa la fecha con la culase va a comparar.
    *
    * El m�todo comprar se encarga de devolvernos respuesta a tres posibilidades.
    * 1: si la fecha es menor que la otra retorna -1.
    * 2: si la fecha es igual que la otra retorna 0.
    * 3: si la fecha es mayor que la otra retorna 1.
    *
    * @return -1 s� es menor; 0 s� es igual; 1 s� es mayor.
    *
    */

    public int comparar(Fecha otra) {
      if (anyo < otra.getAnio() ){
          return -1;
        }else if (anyo > otra.getAnio()){
        return 1;
        }else if (anyo == otra.getAnio()){
        if(mes < otra.getMes()){
          return -1;
        }else if (mes > otra.getMes()){
          return 1;
        }else if (mes == otra.getMes()){
          if (dia < otra.getDia() ){
            return -1;
          }else if(dia > otra.getDia()){
            return 1;
          }else{
            return 0;
          }
        }

      }
    }


     /**
    * toString se encargar� de convertir el tipo abstracto fecha en un tipo cadena
    * para su posterior visualizaci�n
    *
    * @return una cadena que contiene la fecha
    */
    public String toString() {
      String str="Dia "+dia+" mes "+mes+" a�o "+anyo+" ";
        return str;
    }
}