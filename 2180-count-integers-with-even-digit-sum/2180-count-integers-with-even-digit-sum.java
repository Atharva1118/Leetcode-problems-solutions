// class Solution {
//     public int countEven(int num) {
//         int count=0;
//         for(int i=1;i<=num;i++){
//             int sum=0;
//             int n=i;
//             while(n>0){
//                 int digit=n%10;
//                 sum=sum+digit;
//                 n=n/10;
//             }
//             if(sum%2==0){
//                 count++;
//             }
//         }
//         return count;
//     }
// }



class Solution {
    public int countEven(int num) {
        int sum = 0;
        int n = num;

        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }

        if(sum % 2 == 0) {
            return num / 2;
        } else {
            return (num - 1) / 2;
        }
    }
}
