import java.util.*;

class Solution {
    public List<String> removeInvalidParentheses(String s) {

        Set<String> set = new HashSet<>();

        int leftRemove = 0;
        int rightRemove = 0;

        // Find minimum removals
        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                leftRemove++;
            } 
            else if (ch == ')') {

                if (leftRemove > 0) {
                    leftRemove--;
                } 
                else {
                    rightRemove++;
                }
            }
        }

        solve(s, 0, leftRemove, rightRemove, 0,
              new StringBuilder(), set);

        return new ArrayList<>(set);
    }

    private void solve(
        String s,
        int index,
        int leftRemove,
        int rightRemove,
        int balance,
        StringBuilder current,
        Set<String> set
    ) {

        // More ')' than '('
        if (balance < 0) {
            return;
        }

        // End of string
        if (index == s.length()) {

            if (leftRemove == 0 &&
                rightRemove == 0 &&
                balance == 0) {

                set.add(current.toString());
            }

            return;
        }

        char ch = s.charAt(index);

        // '('
        if (ch == '(') {

            // Remove '('
            if (leftRemove > 0) {

                solve(
                    s,
                    index + 1,
                    leftRemove - 1,
                    rightRemove,
                    balance,
                    current,
                    set
                );
            }

            // Keep '('
            current.append(ch);

            solve(
                s,
                index + 1,
                leftRemove,
                rightRemove,
                balance + 1,
                current,
                set
            );

            current.deleteCharAt(current.length() - 1);
        }

        // ')'
        else if (ch == ')') {

            // Remove ')'
            if (rightRemove > 0) {

                solve(
                    s,
                    index + 1,
                    leftRemove,
                    rightRemove - 1,
                    balance,
                    current,
                    set
                );
            }

            // Keep ')' only if there is '(' available
            if (balance > 0) {

                current.append(ch);

                solve(
                    s,
                    index + 1,
                    leftRemove,
                    rightRemove,
                    balance - 1,
                    current,
                    set
                );

                current.deleteCharAt(current.length() - 1);
            }
        }

        // Letter
        else {

            current.append(ch);

            solve(
                s,
                index + 1,
                leftRemove,
                rightRemove,
                balance,
                current,
                set
            );

            current.deleteCharAt(current.length() - 1);
        }
    }
}