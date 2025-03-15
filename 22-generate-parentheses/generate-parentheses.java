class Solution {
    public List<String> generateParenthesis(int n) {
       List<String> result = new ArrayList<>();
       String str = "";
       backtrack(0,0, result,str, n);
       return result;

    }

    public void backtrack(int openB, int closeB, List<String> result, String str, int n){
        if(openB == closeB && openB == n){
            result.add(str.toString());
        }
        if(openB < n){
            backtrack(openB + 1, closeB, result,str + "(", n);
        }
        if(closeB < openB){
             backtrack(openB, closeB + 1, result,str + ")", n);
        }
    }
}
