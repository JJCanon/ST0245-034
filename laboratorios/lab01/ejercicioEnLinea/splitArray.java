public boolean splitArray(int[] nums) {
  return arr(0,nums,0,0);
}

private boolean arr(int ini,int[] nums,int s1,int s2) {
int n= nums.length;
  if (ini >= n) {
  return s1==s2;
  }
  if (arr(ini+1, nums,  s1+nums[ini], s2)) {
  return true;
  }
  if (arr(ini+1,nums,s1,s2+nums[ini])){
  return true;
  } 
  return false;
}