public class Solution {

    public String encode(List<String> strs) {
        StringBuilder str1 = new StringBuilder();
        for (String str : strs) {
            str1.append(str.length()).append('#').append(str);
        }
        return str1.toString();

    }

    public List<String> decode(String str) {
        ArrayList<String> result = new ArrayList<String>();
        int i = 0;

        while (i < str.length()) {
            // finding position of # starting from index i
            // 4#neet4#code
            // j = 1
            int j = str.indexOf('#', i);

            //
            // we saved the length of each string to be the first character, now extract
            // that
            int length = Integer.parseInt(str.substring(i, j));

            // extract the string and add to a list
            String s = str.substring(j + 1, j + 1 + length);
            result.add(s);
            i = j + 1 + length;

        }
        return result;
    }
}
