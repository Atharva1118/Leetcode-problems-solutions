class Solution {
    public int minAddToMakeValid(String s) {
        Stack <Character> st = new Stack<>();
        int count =0;

        for(char ch :s.toCharArray()){
            if(ch == '('){
                st.add(ch);
            }
            else {
                if(!st.isEmpty()){
                    st.pop();
                    count = count +1;
                }
                
            }
        }
        return s.length() - count*2;
        
    }
}