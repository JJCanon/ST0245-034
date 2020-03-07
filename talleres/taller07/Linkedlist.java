public class Linkedlist {

    private Nodo cabeza;
    private int size;
    public Linkedlist()
    {
        cabeza = null;
        size=0;
    }

    public boolean Isempty() {
        if (cabeza == null)
        {
            return true;
        }else return false;
    }

    public Object Search(int index)
    {
        Nodo temp = cabeza;
        for(int i=0;i<index;i++)
        {
            temp = temp.Obtenersiguiente();
        }
        return temp.Obtenervalor();
    }
    public void Addfirst(Object obj)
    {
        if(cabeza==null)
        {
            cabeza = new Nodo(obj);
        }else
        {
            Nodo nuevo = new Nodo(obj);
            nuevo.Enlazarsiguiente(cabeza);
            cabeza = nuevo;
        }
        size++;
    }

    public void AddSpecific(int index, Object obj){
        if(index>=0 && index<=size){//C1 = O(1)
            Nodo nuevo = new Nodo(obj);//C2 = O(1)
            if(index == 0){//C3 = O(1)
                Addfirst(obj);//C4 = O(1)
            }
            else{
                if(index == size){//C5 = O(1)
                    Nodo aux = cabeza;//C6 = O(1)
                    while(aux.Obtenersiguiente() != null){//C7+C8n = O(n)
                        aux = aux.Obtenersiguiente();//C9n = O(n)
                    }
                    aux.Enlazarsiguiente(nuevo);//C10 = = O(1)
                }
                else{
                    Nodo temp = cabeza;//C11 = O(1)
                    for (int i = 0; i < (index-1); i++) {//C12+C13n = O(n)
                        temp = temp.Obtenersiguiente();//C14n = O(n)
                    }
                    Nodo siguiente = temp.Obtenersiguiente();//C15 = O(1)
                    temp.Enlazarsiguiente(nuevo);//C16 = O(1)
                    nuevo.Enlazarsiguiente(siguiente);//C17 = O(1)
                }
                size++;//C18 = O(1)
            }
        }
        
    }

    public void Deletefirst()
    {
        cabeza = cabeza.Obtenersiguiente();
        size--;
    }

    public void DeleteSpecific(int index)
    {
        if(index==0)
        {
            Deletefirst();
        }else
        {
            Nodo temp = cabeza;
            for(int i=0;i<index-1;i++)
            {
                temp = temp.Obtenersiguiente();
            }
            temp.Enlazarsiguiente(temp.Obtenersiguiente().Obtenersiguiente());
        }size--;
    }

    public int getSize()
    {
        return size;
    }

}
