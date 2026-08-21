public class Solution {

    public int reverseBits(int n) {

        int ans = 0;

        for (int i = 0; i < 32; i++) {

            // Last bit nikalo
            int bit = n & 1;

            // Answer me bit add karo
            ans = (ans << 1) | bit;

            // Next bit par jao
            n = n >>> 1;
        }

        return ans;
    }
}
