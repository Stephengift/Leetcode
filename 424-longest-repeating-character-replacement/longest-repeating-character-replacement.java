class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxCount = 0;
        int longest = 0;
        int[] counts = new int[26];

        //condition-(right - left + 1 - maxCount > k)
        for(int right = 0; right < s.length(); right++){
            counts[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, counts[s.charAt(right) - 'A']);
            
            while (right - left + 1 - maxCount > k){
                counts[s.charAt(left) - 'A']--;
                left++;
            }
            longest = Math.max(longest, right-left + 1);
        }
        return longest;
    }
}