import java.util.*;
public class Punto_2{
  public static void main(String[] args) {
    ArrayList <Integer> list = new ArrayList();
    Scanner sc = new Scanner(System.in);
    int a=0;
    while(a!=-1){
      System.out.println("Digite un número");
      a=sc.nextInt();
      list.add(a);
    }
    invertido(list);
  }
  public static void invertido(ArrayList<Integer> list) {
    for(int i = 0, j = list.size() - 1; i < j; i++) {
        list.add(i, list.remove(j));
    }
    for(int i=0;i<list.size();i++){
      System.out.println(list.get(i));
    }
}
}