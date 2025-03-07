class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, "", 0, 0, n);
        return res;
    }

    private void backtrack(List<String> res, String current, int openN, int closedN, int n) {
        if (openN == n && closedN == n) {
            res.add(current);
            return;
        }

        if (openN < n) {
            backtrack(res, current + "(", openN + 1, closedN, n);
        }

        if (closedN < openN) {
            backtrack(res, current + ")", openN, closedN + 1, n);
        }
    }
}