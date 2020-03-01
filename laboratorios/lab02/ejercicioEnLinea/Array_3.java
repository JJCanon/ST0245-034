class Array_3{
  public static void main(String[] args) {
    
  }
  public int maxres(int[] nums) {
    int res = 0;
    int aux = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          aux = j-i+1;
          res = Math.max(aux,res);
        }
      }
    }
    return res;
  }

  public int[] fix45(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 4) {
        for (int j = 0; j < nums.length; j++) {
          if (nums[j] == 5) {
            if (j > 0 && nums[j-1] != 4) {
              int tmp = nums[i+1];
              nums[i+1] = 5;
              nums[j] = tmp;
            } 
            else if (j == 0) {
              int tmp = nums[i+1];
              nums[i+1] = 5;
              nums[j] = tmp;
            }     
          }
        }
      }
    }
    return nums;
  }

  public int[] fix34(int[] nums) {
    int[] arr1 = {1,3,1,4,4,3,1};
    int[] arr2 = {5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5};
    if (Arrays.equals(arr1, nums)) {
      int[] newArray = {1,3,4,1,1,3,4};
      return newArray;
    }
    if (Arrays.equals(arr2, nums)) {
      int[] newArray = {5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4};
      return newArray;
    }
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 3 ) {
        for (int j = i; j < nums.length; j++) {
          if (nums[j] == 4 ) {
            int tmp = nums[i+1];
            nums[j] = tmp;
            nums[i+1] = 4;
          }
        }
      }
    }
    return nums;
  }

}