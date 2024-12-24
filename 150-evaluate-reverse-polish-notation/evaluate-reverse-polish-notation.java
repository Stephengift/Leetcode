class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> newStack = new Stack <>();
        for(String token : tokens){
            if(token.equals("+")){
                int a = newStack.pop();
                int b = newStack.pop();
                newStack.push(a + b);
            }
            else if(token.equals("-")){
                int a = newStack.pop();
                int b = newStack.pop();
                newStack.push(b - a);
            }
            else if(token.equals("*")){
                int a = newStack.pop();
                int b = newStack.pop();
                newStack.push(a * b);
            }
            else if(token.equals("/")){
                int a = newStack.pop();
                int b = newStack.pop();
                newStack.push(b / a);
            }else{
                newStack.add(Integer.parseInt(token));

            }
        }
        return newStack.pop();
    }
}

//[2,1, +]