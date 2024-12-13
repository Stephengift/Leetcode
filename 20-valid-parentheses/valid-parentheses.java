class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack <>();

        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }
            else if(s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }
            else if(s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }
            else{
                return false;
            }
        }
        
        //built in function that returns a boolean - true if stack is empty
        return stack.isEmpty();
    }
    
}


      
    

             
             
           