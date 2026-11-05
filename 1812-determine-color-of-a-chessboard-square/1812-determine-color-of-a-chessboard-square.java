class Solution {
    public boolean squareIsWhite(String coordinates) {
        char ch = coordinates.charAt(0);
        int sch=coordinates.charAt(1)-'0';
        if (ch == 'a' || ch == 'c' || ch == 'e' || ch == 'g') {
            if(sch%2==0){
                return true;
            }
        }else{
            if(sch%2!=0){
                return true;
            }
        }
        return false;
    }
}