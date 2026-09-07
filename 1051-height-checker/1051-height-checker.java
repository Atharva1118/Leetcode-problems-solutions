
// class Solution {
//     public int heightChecker(int[] heights) {
//         // 1. Create a copy of the original heights array
//         int[] expected = heights.clone(); 
        
//         // 2. Sort the copy in ascending order
//         Arrays.sort(expected);
        
//         // 3. Compare the original vs the sorted array
//         int count = 0;
//         for (int i = 0; i < heights.length; i++) {
//             if (heights[i] != expected[i]) {
//                 count++;
//             }
//         }
        
//         return count;
//     }
// }


class Solution {
    public int heightChecker(int[] heights) {
        int[] res=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            res[i]=heights[i];
        }
        Arrays.sort(res);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != res[i]) {
                count++;
            }
        }
        
        return count;
    }
}
//Time Complexity=O(nlogn)
//Space Complexity=O(n)

