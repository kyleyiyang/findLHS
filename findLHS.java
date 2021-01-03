class Solution {
    public int findLHS(int[] nums) {
        int ans=0;
        boolean hasNum = false;
        for (int i=0;i<nums.length;i++) {
            int plusOne = 0;
            int minusOne = 0;
            for (int j=0;j<nums.length;j++) {
                if (nums[i]==nums[j]) {plusOne++;minusOne++;}
                else if (nums[i]-nums[j]==1) {plusOne++;hasNum = true;}
                else if (nums[i]-nums[j]==-1) {minusOne++;hasNum = true;}
            }
            ans = Math.max(ans, Math.max(plusOne,minusOne));
        }
        return hasNum? ans : 0;
    }
}
