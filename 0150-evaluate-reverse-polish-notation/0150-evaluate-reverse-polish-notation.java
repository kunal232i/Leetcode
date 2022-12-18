class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        /*
        
        RPN
        2 1 +
        2 + 1


        2, 1, +, 3, *

        ((2+1) * 3) = 9


        stack (LIFO)
        push numebers
        if(operator ) then apply operation, pop 2 nums, 
        push res.
        
        */
        for(String token : tokens){
            if(token.equals("+")){
                int a = stack.pop();
                int b = stack.pop();
                stack.add(a+b);
            }else if(token.equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                stack.add(b-a);
            }else if(token.equals("*")){
                stack.add(stack.pop() * stack.pop());
            }else if(token.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                stack.add(b/a);
            }else{
                stack.add(Integer.parseInt(token));
            }
        }
        
  
        return stack.pop();
    }
}