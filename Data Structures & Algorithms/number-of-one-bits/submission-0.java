class Solution {
    public int hammingWeight(int n) {
        
        int count = 0;

        while(n>0){  // Met 1 ==> 30 + 29 like app 
            n= n & (n-1);
            count++;
        }
        return count;
    }
}

// Met 2
        // while (n != 0) {
        //     count += (n & 1); // last bit check
        //     n = n >>> 1;      // right shift (unsigned)
        // }

