class Solution {
    public boolean validString(String s){
        int count=0;
        for(char ch: s.toCharArray()){
            if(ch=='('){
                count++;
            }else{
                count--;
            }
            if(count<0){
                return false;
            }
        }
        if(count==0){
            return true;
        }
        return false;
    }
    public void generateParenthesisHelper(String curr,int n,List<String> res){
        if(curr.length()==2*n){
            if(validString(curr)){
                res.add(curr);
            }
            return ;
        }
        generateParenthesisHelper(curr+"(",n,res);
        generateParenthesisHelper(curr+")",n,res);
    }
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        generateParenthesisHelper("",n,res);
        return res;
    }
}