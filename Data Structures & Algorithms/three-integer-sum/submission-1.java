
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);   // step 1: sort

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            // step 2: duplicate skip for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1;
            int k = n - 1;

            while (j < k) {

                int sum = nums[i] + nums[j] + nums[k];

                if (sum < 0) {
                    j++;   // sum chhota hai → bada karo
                } 
                else if (sum > 0) {
                    k--;   // sum bada hai → chhota karo
                } 
                else {
                    // triplet mil gaya
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    j++;
                    k--;

                    // duplicate skip for j
                    while (j < k && nums[j] == nums[j - 1]) j++;

                    // duplicate skip for k
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }

        return ans;
    }
}
