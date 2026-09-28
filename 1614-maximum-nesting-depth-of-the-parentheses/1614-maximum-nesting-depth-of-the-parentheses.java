class Solution {
    public int maxDepth(String s) {
        int currentDepth = 0;
        int maxDepth = 0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                currentDepth++;
                maxDepth = Math.max(maxDepth, currentDepth);
            }
            if(s.charAt(i)==')'){
                currentDepth--;
            }
        }
        return maxDepth;
    }
}
//Space Complexity: O(1)
//Time Complexity:O(n)