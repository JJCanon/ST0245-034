public boolean canBalance(int[] nums) {
 int cont=0;
        for(int i=0;i<nums.length;i++)
        {
            cont+=nums[i];
            int cont2=0;
            for(int j=nums.length-1;j>i;j--)
            {
                cont2+=nums[j];
            }
            if(cont==cont2)
            {
                return true;
            }
        }
        return false;
}
