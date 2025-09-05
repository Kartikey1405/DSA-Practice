class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int positives=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=0)
            positives++;
        }
        if(positives==1)
        return nums[0]*nums[1]*nums[nums.length-1];

      if (positives == 0)
    return nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];

         
             int negProduct=nums[0]*nums[1]*nums[nums.length-1];
             int posProduct=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];

             return posProduct>negProduct?posProduct:negProduct;

    
       
         
 
    }

}