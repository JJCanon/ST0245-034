public class taller2
{
  public static  void main(String [] args)
  {
    int[] num={2,4,8};
    System.out.println(punto1(9,3));
    System.out.println(punto2(0,num,10));
  }
  public static int punto1(int p, int q)
  {
    if(p%q==0){
      return q;
    }
    return punto1(q, p%q);
  }
  public static boolean punto2(int start, int [] nums, int target)
  {
    if (start==nums.length)
    return target==0;
    else
    return punto2(start+1, nums,target-nums[start])||punto2(start+1,nums,target);

    

  }

}