class Solution {
    public String reverseWords(String s) {
        String[] words=s.trim().split("\\s+");
        int left=0;
        int right=words.length-1;
        while(left<right){
            String temp=words[left];
            words[left]=words[right];
            words[right]=temp;
            left++;
            right--;

        }
        String result=String.join(" ",words);
        return result;
    }
}

//Time complexity: O(n), where n is the length of the input string. Splitting into words scans the string once, and then reversing the array touches each word once. Joining the words also processes all words. Overall linear in total input size.

//Space complexity: O(k), where k is the number of words. The split operation creates an array of words, and the join operation creates the final string. In addition, a few extra variables are used. Overall auxiliary space is proportional to the number of words (plus the output string).
