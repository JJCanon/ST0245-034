 public class Array2{
  public static void main(String[] args) {
    
  }
  public int countEvens(int[] nums) {
  int cont=0;//O(1)
  for (int i =0 ; i < nums.length;i++){//C1*O(1) ó O(n)
    if(nums[i]%2==0){//O(1)
      cont++;//O(1)
    }
  }
  return cont;//O(1)
}

 public int[] fizzArray(int n) {
  int [] arr = new int [n];//O(1)
  for(int i=0; i<n;i++){//O(n)
    arr[i]=i;//O(1)
  }
  return arr;//O(1)
}



}