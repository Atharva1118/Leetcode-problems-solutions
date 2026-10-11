// class Solution {
//     public boolean judgeSquareSum(int c) {
//         for(int i=0;i<=c;i++){
//             for(int j=0;j<=c;j++){
//                 long sum = ((long) i * i) + ((long) j * j); 
//                 if(sum>c){
//                     break;
//                 }
//                 if(sum==c){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }



class Solution {
    public boolean judgeSquareSum(int c) {
        long i = 0;
        long j = (long) Math.sqrt(c);

        while (i <= j) {
            long sum = (i * i) + (j * j);

            if (sum == c) {
                return true;
            } else if (sum < c) {
                i++;
            } else {
                j--;
            }
        }

        return false;
    }
}