class Solution {
    public String mergeAlternately(String word1, String word2) {
                StringBuilder result = new StringBuilder();
        int i = 0;
        int j = 0;
        
        // Loop as long as there is a character left in AT LEAST one string
        while (i < word1.length() || j < word2.length()) {
            // If word1 still has characters, add the current one
            if (i < word1.length()) {
                result.append(word1.charAt(i));
                i++;
            }
            // If word2 still has characters, add the current one
            if (j < word2.length()) {
                result.append(word2.charAt(j));
                j++;
            }
        }
        
        return result.toString();
    }
}