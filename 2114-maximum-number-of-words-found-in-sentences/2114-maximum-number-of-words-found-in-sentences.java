class Solution {
    public int mostWordsFound(String[] sentences) {
        // maxlength=0
        // curr=0
        // for i in sentences:
        //     curr=len(i.split())
        //     maxlength=max(curr,maxlength)
        // return maxlength
        int curr=0;
        int maxlength=0;
        for(String i: sentences){
            curr=(i.split(" ")).length;
            maxlength=Math.max(curr,maxlength);
        }   
        return maxlength;
    }
}