class Solution {
    //Time Complexity=O(nlogn+n.n)=O(n^2)
    //Space Complexity=O(n)
    public void twoSumHelper(int[] nums,int f,List<List<Integer>> res){
        int i=f+1;
        int j=nums.length-1;
        while(i<j){
            int  sum=nums[f]+nums[i]+nums[j];
            if(sum>0){
                j--;
            }else if(sum<0){
                i++;
            }else{
                res.add(Arrays.asList(nums[i],nums[j],nums[f]));
                j--;
                i++;
                while(i<j && nums[i]==nums[i-1]){
                    i++;
                }
                while(i<j && nums[j]==nums[j+1]){
                    j--;
                }
            }
        }

    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int f=0;f<nums.length;f++){
            if(nums[f]>0){
                break;
            }
            if(f==0 || nums[f]!=nums[f-1]){
                twoSumHelper(nums,f,res);

            }
        }
        return res;
    }
}