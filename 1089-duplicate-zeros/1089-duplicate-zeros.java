
// class Solution {
//     public void duplicateZeros(int[] arr) {
//         // Amazon, Google
//         //Time Complexity=O(n)
//         //Space=O(n)
//         int s=0;
//         int d=0;
//         int[] dest=new int[arr.length];
//         while(s<arr.length){
//             if(arr[s]==0){
//                 if (d < dest.length) {
//                     dest[d] = 0;              
//                 }
//                 d++;
//                 if (d < dest.length) {
//                     dest[d] = 0;
//                     d++;
                   
//                 }
//             }else{
//                 if (d < dest.length) {
//                     dest[d] = arr[s];
//                     d++;
//                 }
//             }
            
//             s++;
//         }
//         for(int i=0;i<arr.length;i++){
//             arr[i]=dest[i];
//         }
        
//     }
// }

class Solution {
    public void duplicateZeros(int[] arr) {
        // Amazon, Google
        // Time Complexity = O(n)
        // Space Complexity = O(1)

        int maxZero = 0;
        int lastIdx = arr.length - 1;

        
        for (int i = 0; i <= lastIdx - maxZero; i++) {

            if (arr[i] == 0) {

           
                if (i == lastIdx - maxZero) {
                    arr[lastIdx] = 0;
                    lastIdx--;
                    break;
                }

                maxZero++;
            }
        }

        int newLastIdx = lastIdx - maxZero;

      
        for (int i = newLastIdx; i >= 0; i--) {

            if (arr[i] == 0) {
                arr[i + maxZero] = 0;
                maxZero--;
                arr[i + maxZero] = 0;
            } 
            else {
                arr[i + maxZero] = arr[i];
            }
        }
    }
}