class Solution {
    public int[] sortedSquares(int[] nums) {
           int n=nums.length;
        int ans[]=new int[n];
        int left=0;
        int right=n-1;
        int i=n-1;

        while(left<=right){
            int lsq=nums[left]*nums[left];
            int rsq=nums[right]*nums[right];
            if(lsq>rsq){
                ans[i]=lsq;
                left++;
            }else{
                ans[i]=rsq;
                right--;
            }
            i--;
        }

        return ans;
        
    }
}