class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //use a monotonic stack to ensure that the elements in a stack are increasing, if not pop
        int[] tempArray = new int[temperatures.length];
        Stack <Integer> tempStack = new Stack <>();
        for(int i = 0; i < temperatures.length;i++){
            while(!tempStack.isEmpty() && temperatures[tempStack.peek()] < temperatures[i]){
                int j = tempStack.pop();
                tempArray[j] = i - j;
                
            }
            tempStack.push(i);
        }
        return tempArray;
      
    }
}