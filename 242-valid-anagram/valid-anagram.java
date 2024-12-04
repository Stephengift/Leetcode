public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.toCharArray() == t.toCharArray()){
            return false;
        }
       HashMap<Character, Integer> hmap1 = new HashMap<>();
        HashMap<Character, Integer> hmap2 = new HashMap<>();

        for(Character character: s.toCharArray()){
            hmap1.put(character, hmap1.getOrDefault(character,0)+1);
        }
        for(Character character: t.toCharArray()){
            hmap2.put(character, hmap2.getOrDefault(character,0)+1);
        }
        return hmap1.equals(hmap2);
    
    }
}
