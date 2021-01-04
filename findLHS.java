class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for (int i=0;i<nums.length;i++) {
            boolean hasNum = false;
            int j=i+1;
            while (j<nums.length && (nums[j]==nums[i] || nums[j]-1==nums[i])) {
                if (nums[j]-1==nums[i]) hasNum = true;
                j++;
            }
            if (hasNum) ans = Math.max(ans, j-i);
            //System.out.println(ans);
        }
        return ans;
    }
}
