public class Nodo {
    private Object valor;
    private Nodo siguiente;

    public Nodo(Object valor) {

        this.valor = valor;
        this.siguiente= null;
    }

    public Object Obtenervalor()
    {
        return valor;
    }

    public void Enlazarsiguiente(Nodo siguiente)
    {
        this.siguiente = siguiente;
    }

    public Nodo Obtenersiguiente()
    {
        return siguiente;
    }


}
