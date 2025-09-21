class Solution {
    public int lengthOfLongestSubstring(String s) {
        //Create a set of characters
        Set<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int length = 0;

        while(right < s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                length = Math.max(length, set.size());
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return length;
    }
}