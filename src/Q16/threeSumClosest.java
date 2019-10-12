package Q16;

import java.util.Arrays;

/**
 * Given an array nums of n integers and an integer target,
 * find three integers in nums such that the sum is closest to target.
 * Return the sum of the three integers. You may assume that each input would have exactly one solution.
 */

public class threeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        if(nums==null || nums.length<3)     return 0;
        if(nums.length==3)                  return nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        int n=nums.length;
        int sum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<n-2;i++){
            if(nums[i]+nums[n-1]+nums[n-2]<target){
                sum=nums[i]+nums[n-1]+nums[n-2];
                continue;
            }
            if(nums[i]+nums[i+1]+nums[i+2]>target){
                int temp=nums[i]+nums[i+1]+nums[i+2];
                return lessGap(sum,temp,target);
            }
            int j=i+1;
            int k=n-1;
            while(j<k){
                int temp=nums[i]+nums[j]+nums[k];
                if(temp==target)            return target;
                if(temp<target){
                    j++;
                    sum=lessGap(sum,temp,target);
                }
                else{
                    k--;
                    sum=lessGap(sum,temp,target);
                }
            }
        }
        return sum;
    }
    private int lessGap(int sum,int temp,int target){
        return Math.abs(sum-target)<Math.abs(temp-target) ? sum : temp;
    }
}
