class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int maximum = 0;
        HashSet<Character> map = new HashSet<>();
        while(right < s.length()){
            if(map.contains(s.charAt(right))){
                map.remove(s.charAt(left));
                left++;
            }
            else{
                map.add(s.charAt(right));
                right++;
                maximum = Math.max(maximum, right-left);
            }
        }
        return maximum;
  
    
    }
}

