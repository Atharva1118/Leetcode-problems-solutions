
class Solution {
    public void duplicateZeros(int[] arr) {
        // Amazon, Google
        //Time Complexity=O(n)
        //Space=O(n)
        int s=0;
        int d=0;
        int[] dest=new int[arr.length];
        while(s<arr.length){
            if(arr[s]==0){
                if (d < dest.length) {
                    dest[d] = 0;              
                }
                d++;
                if (d < dest.length) {
                    dest[d] = 0;
                    d++;
                   
                }
            }else{
                if (d < dest.length) {
                    dest[d] = arr[s];
                    d++;
                }
            }
            
            s++;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=dest[i];
        }
        
    }
}