class Solution {
    public boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        for (char b : s.toCharArray()) {

            if (b == '(' || b == '[' || b == '{') {
                stack.push(b);
            } 
            else {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (b == ')' && top != '(') return false;
                if (b == ']' && top != '[') return false;
                if (b == '}' && top != '{') return false;
            }
        }

        return stack.isEmpty();
    }
}