class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> result=new ArrayList<>();
        String target = String.valueOf(x);
        for(int i=0;i<words.length;i++){
            if(words[i].contains(target)){
                result.add(i);
            }
        }
        return result;
    }
}