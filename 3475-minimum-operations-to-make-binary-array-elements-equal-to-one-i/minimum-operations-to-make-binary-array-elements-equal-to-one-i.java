class Solution {
    public int minOperations(int[] nums) {
        int counter=0;
        for(int i=2;i<nums.length;i++)
        {
            if(nums[i-2]==1)
            continue;

           for (int j = i-2; j <= i; j++) {
    nums[j] = 1 - nums[j];
}
           counter++;
        
            
        }




        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=1)
            return -1;
        }
        return counter;
        
    }
}