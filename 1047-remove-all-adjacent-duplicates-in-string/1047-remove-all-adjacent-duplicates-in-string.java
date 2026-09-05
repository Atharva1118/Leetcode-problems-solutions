class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int size = sb.length();
            
            // If the current character matches the last added character, remove it
            if (size > 0 && sb.charAt(size - 1) == ch) {
                sb.deleteCharAt(size - 1);
            } else {
                // Otherwise, push it to our "stack"
                sb.append(ch);
            }
        }
        
        return sb.toString();
    }
}
