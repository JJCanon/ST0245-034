import java.util.ArrayList;
class Punto_1{
  public static void main(String[] args) {
  
  }

  public static void insertar(int n,ArrayList<String> list,String dato){
    int len=list.size()-1;
    ArrayList<String> res = new ArrayList<>();
    for(int i=0;i<n;i++){
      res.add(i, list.get(i));
    }
    res.add(n, dato);
    for(int j=n;j<list.size();j++){
      res.add(j+1, list.get(j));
    }
    for(int i=0;i<res.size();i++){
      System.out.println(res.get(i));
    }
  }
  public static void eliminar(int n,ArrayList<String> list){
    int len=list.size()-1;
    list.remove(n);
    for(int i=0;i<len;i++){
      System.out.println(list.get(i));
    }
  }
}