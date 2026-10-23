class Solution {
    public int sortPermutation(int[] nums) {
        int n = nums.length;

        int K = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] != i) {
                K &= nums[i];
            }
        }

        return K == -1 ? 0 : K;
    }
}

//Dry Run

// [0,3,2,1]
// k=-1

// i=0
// nums[i]=i pass
// i++

// i=1
// nums[i]=3
// nums[i]!=i
// k=-1&3=3

// 11111111
// 00000011
// --------
// 00000011

// k=3
// i++

// i=2
// nums[i]=2
// i==nums[i]   pass
// i++

// i=3
// nums[i]=1
// nums[i]!=i
// k=3&1=1

// 11
// 01
// ---
// 01
// k=1

