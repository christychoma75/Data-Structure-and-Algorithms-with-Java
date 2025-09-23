class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        //convert the dictionary to a set for 0(1) lookups
        Set<String> wordSet = new HashSet<>(wordDict);

        //find the maxLen
        int maxLen = 0;
        for(String word : wordDict){
            maxLen = Math.max(maxLen, word.length());
        }

        int n = s.length();
        boolean dp[] = new boolean[n + 1];
        //empty base case
        dp[0] = true;
        for(int i = 1; i <= n; i++){
            for(int j = i - 1; j >= Math.max(0, i - maxLen); j--){
                if(dp[j] && wordSet.contains(s.substring(j, i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}