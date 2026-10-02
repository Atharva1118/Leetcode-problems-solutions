class Solution {
    public int[] numberGame(int[] nums) {
        //new=[]
        // nums.sort()
        // while len(nums)>0:
        //     new.append(nums.pop(1))
        //     new.append(nums.pop(0))
        // return new

         ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }

        Collections.sort(list);

        int[] result = new int[nums.length];
        int index = 0;

        while (list.size() > 0) {
            result[index++] = list.remove(1);
            result[index++] = list.remove(0); 
        }

        return result;
    }
}