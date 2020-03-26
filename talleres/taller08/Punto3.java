import java.util.Stack;

public class Punto3 {
    public Stack<Integer> invertir(Stack <Integer> pila)
    {
        int tamaño =pila.size();
        int variable=0;
        Stack<Integer> nuevaPila=new Stack<>();
        for(int i = 0;i<tamaño;i++)
        {
            variable=pila.pop();
            nuevaPila.push(variable);
        }
        return nuevaPila;
    }
}
