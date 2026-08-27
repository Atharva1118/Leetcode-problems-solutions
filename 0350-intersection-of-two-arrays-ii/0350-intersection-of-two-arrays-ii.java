class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num : nums1){
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        int[] res=new int[nums1.length];
        int k=0;
        for(int num: nums2){
            int count=map.getOrDefault(num,0);
            if(count==0){
                continue;
            }else{
                res[k]=num;
                k++;
                map.put(num,count-1);
            }

        }
        return Arrays.copyOfRange(res,0,k);
    }
}