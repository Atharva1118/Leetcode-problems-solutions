class Solution {
    // public int singleNumber(int[] nums) {
    //     Map<Integer,Integer> map=new HashMap<>();
    //     for(int num : nums){
    //         if(!map.containsKey(num)){
    //             map.put(num,0);
    //         }
    //         map.put(num,map.get(num)+1);
    //     }
    //     for(int num: nums){
    //         if(map.get(num)==1){
    //             return num;
    //         }

    //     }
    //     return -1;
        
    // }

       public int singleNumber(int[] nums) {
        int res=0;
        // 0^2^2^1=2^2^1=0^1=1
        for(int num: nums){
            res=res^num;
        }
        return res;

    }
}