// class Solution {
//     public List<Integer> findDisappearedNumbers(int[] nums) {
//         int n=nums.length;
//         ArrayList<Integer> numbers = new ArrayList<>();
//         ArrayList<Integer> result = new ArrayList<>();
//         HashSet<Integer> set = new HashSet<>();
        
//         // Add all existing numbers to the set (removes duplicates automatically)
//         for (int num : nums) {
//             set.add(num);
//         }
        
//         // Check which numbers from 1 to n are missing
//         for (int i = 1; i <= n; i++) {
//             if (!set.contains(i)) {
//                 result.add(i);
//             }
//         }
        
//         return result;
//     }
// }


class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        
        // Step 1: Iterate through the array and mark present indices as negative
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; // Get the original value as a 0-based index
            if (nums[index] > 0) {
                nums[index] = -nums[index]; // Mark as visited
            }
        }
        
        // Step 2: Any index that remains positive means that number (index + 1) never appeared
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        
        return result;
    }
}