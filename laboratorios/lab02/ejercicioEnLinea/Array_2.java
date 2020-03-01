class Array_2{
  public static void main(String[] args) {
    
  }

  public int[] post4(int[] nums) {
    int suma=nums.length-1;

    while(nums[suma] != 4){
      suma--;
    }
    int[] arr = new int[nums.length - 1 - suma];
      for(int i = suma + 1; i < nums.length; i++){
        arr[i - suma - 1] = nums[i];
      }
    return arr;
  }

  public int[] shiftLeft(int[] nums) {
    int temp = 0;
    for(int i=0; i<nums.length-1; i++){
      temp = nums[i];
      
      nums[i]= nums[i+1];
      nums[i+1] = temp;
    }
    return nums;
  }

public boolean sameEnds(int[] nums, int len) {
  boolean a =true;
  int b = nums.length;
  for(int i=0;i<len;i++){
    if (nums[i] == nums[b-len+i]){
      a = true;
    }else{
      a =false;
    }

  }
  return a;
}

public boolean only14(int[] nums) {
  int cont=0;
  for(int i=0;i<nums.length;i++){
    if(nums[i]==1||nums[i]==4){
      cont++;
    }
  }
  if(cont==nums.length){
    return true;
  }
  return false;
}

public boolean sum28(int[] nums) {
  int cont=0;
  for(int i=0;i<nums.length;i++){
    if (nums[i]==2){
      cont=cont+nums[i];
    }
  }
  if(cont==8){
    return true;
  }
  return false;
}

public boolean more14(int[] nums) {
  int cont=0;
  int con=0;
    for(int i=0;i<nums.length;i++){
      if(nums[i]==1){
        con++;
      }
      if(nums[i]==4){
        cont++;
      }
    }
    if(con>cont){
      return true;
    }
  return false;
}

public boolean lucky13(int[] nums) {
  for(int i=0;i<nums.length;i++){
    if(nums[i]==1||nums[i]==3){
      return false;
    }
  }
return true;
}

public int matchUp(int[] nums1, int[] nums2) {
  int cont=0;
  for(int i=0;i<nums1.length;i++){
    if(nums1[i] != nums2[i]&& Math.abs(nums1[i] - nums2[i]) <= 2){
      cont++;
    } 
  }
  return cont;
}


}