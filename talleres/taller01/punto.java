import java.lang.Math;
public class Punto {

    private double x=0, y=0;

    /**
     * Se inicializan los atributos de clase
     */
    public Punto(double x, double y) {
    this.x=x;
    this.y=y;
    }

    /**
     * Método para obtener la variable global x.
     *
     * @return eje coordenado x
     
     */
    public double getX() {
    return x;
    }

    /**
     * Método para obtener la variable global y.
     *
     * @return eje coordenado y
     */
    public double getY() {
    return y;
    }

    /**
     * Método para obtener el radio polar, en este caso se puede obtener por medio del teorema de pitágoras.
     * 
     *
     * @return radio polar
     *
     * @see <a href="http://mathworld.wolfram.com/PolarCoordinates.html"> Ver más <a/>
     */
    
    public double radioPolar() {
        return Math.sqrt(x*x + y*y);
    }


    /**
     * Método para obtener el ángulo polar, en este caso se puede obtener por medio de la tangente inversa.
     * 
     *
     * @return angulo polar
     *
     * @see <a href="http://mathworld.wolfram.com/PolarCoordinates.html"> Ver más <a/>
     */
    public double anguloPolar() {
    return Math.atan2(x, y);
    }

    /**
     * Método para obtener la distacia euclidiana. La distacia
     * euclidiana o euclídea es la distancia "ordinaria" (que se mediría con una regla) entre 
     * dos puntos de un espacio euclídeo, la cual se deduce a partir del teorema de Pitágoras.
     * En otras palabras es halla el radio polar a la diferencia entre los dos puntos.
     *
     *
     *
     * @return distancia euclidiana (radio polar a la diferencia de dos puntos)
     *
     * @param otro Este parámetro hace referencia a otro Punto en el espacio con es cual se desea
     * comparar el Punto desde el cual fue llamado.
     * @see <a href="http://mathworld.wolfram.com/Distance.html"> Ver más <a/>
     */
  
    public double distanciaEuclidiana(Punto otro) {
       return Math.sqrt((Math.pow(x-otro.getX(),2))+(Math.pow(y-otro.getY(),2)));
    }

}