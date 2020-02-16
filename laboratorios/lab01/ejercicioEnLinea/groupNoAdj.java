public boolean groupNoAdj(int start, int[] nums, int target) {
  int n= nums.length;
  if(start >= n){
    return target==0;
  }else {
    if (groupNoAdj(start+1,nums, target)){
      return true;
    }
    if (groupNoAdj(start+2, nums, target-nums[start])){
      return true;
    }
  }
  return false;
}