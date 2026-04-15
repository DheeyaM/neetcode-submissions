class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        Map<Character, Character> parentheses = new HashMap<>();
        parentheses.put(')', '(');
        parentheses.put(']', '[');
        parentheses.put('}', '{');

        for (char c : s.toCharArray()){
            if (parentheses.containsKey(c)){
                if (!stack.isEmpty() && stack.peek() == parentheses.get(c)){
                stack.pop();
                }
                else {
                    return false;
                }
                

            }
            else{
                stack.push(c);
            }

        }

        return stack.isEmpty();


    }
       
    
}