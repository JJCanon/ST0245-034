public int array11(int[] nums, int index) {
  int contador=0;
  if (index>=nums.length)
  return 0;
  else
  {
    if(nums[index]==11)
      contador= 1+array11(nums,index+1);
    else
      contador+=array11(nums,index+1);
  }
  return contador;
}
