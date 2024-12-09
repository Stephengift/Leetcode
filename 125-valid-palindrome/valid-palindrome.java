class Solution {
    public boolean isPalindrome(String s) {
        //first remove all special characters and white lines, then check the first index with the last index...
        String regex = "[^a-zA-Z0-9\\s]";
        String newString = s.replaceAll(regex, " ").replaceAll(" ", "").toLowerCase();
        int len = newString.length();
        for(int i = 0; i<newString.length();i++){
            if(newString.charAt(i) != newString.charAt(len - 1- i)){
                return false;
            }
        }
        return true;
    }
}

