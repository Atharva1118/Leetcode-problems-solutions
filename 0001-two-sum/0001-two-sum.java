class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int lookUpNumber=target-nums[i];
            if(map.containsKey(lookUpNumber) && map.get(lookUpNumber)!=i){
                return new int[]{
                    map.get(lookUpNumber),i
                };
            }
        }
        return new int[]{-1,-1};
    }
}