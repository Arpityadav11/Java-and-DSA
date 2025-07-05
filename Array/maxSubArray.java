// leetcode - 53. Maximum Subarray

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = 0,currSum = 0,largest = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currSum = nums[i]+currSum;
            if(nums[i]>largest){
                largest = nums[i];
            }
            if(currSum<0){
                currSum = 0;
            }
            maxSum = Math.max(currSum,maxSum);
        }
        if(maxSum==0){
            maxSum = largest;
        }
        return maxSum;
    }
}
