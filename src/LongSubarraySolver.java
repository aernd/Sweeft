public class LongSubarraySolver {
    int lenOfLongSubarr(int[] array, int k){
        if (array == null) return 0;
        int[] dp = new int[k+1];
        for (int num : array) {
            for (int i = k; i >= num; i--) {
                if (dp[i - num] != 0){
                    dp[i] = Math.max(dp[i], dp[i - num] + 1);
                }
            }
            if(num < dp.length)
                dp[num] = Math.max(dp[num], 1);
        }
        return dp[k];
    }
}
