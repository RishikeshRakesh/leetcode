class Solution {
    public static boolean isValid(String s) {
     Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } 
            
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } 
            
            else {
                return false;
            }
        }
       
        return stack.isEmpty();
    }   
    
    public static void main(String[] args) {
        String para = "()";
        String para1 = "()[]{}";
        String para2 = "(]";
        
        System.out.println(isValid(para));
        System.out.println(isValid(para1));
        System.out.println(isValid(para2)); 
    }
}