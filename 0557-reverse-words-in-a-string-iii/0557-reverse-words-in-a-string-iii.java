class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        ArrayList<String> newWords = new ArrayList<>();

        for (String i : words) {
            StringBuilder sb = new StringBuilder(i);
            sb.reverse();

            newWords.add(sb.toString());
        }
        String result=String.join(" ",newWords);
        return result;
    }
}