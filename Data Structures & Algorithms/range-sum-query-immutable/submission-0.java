class NumArray {

    int[] prefix;

    public NumArray(int[] nums) {  // Calculate Prefix
        int n = nums.length;
        prefix = new int[n];

         prefix[0] = nums[0];
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        
    }
    
    public int sumRange(int left, int right) { // find sumRange
        if(left == 0){
            return prefix[right];
        }

       return prefix[right] - prefix[left-1];
    }
}

