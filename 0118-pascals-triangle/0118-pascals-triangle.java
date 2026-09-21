class Solution {
    public List<List<Integer>> generate(int numRows) {
        //Google,Amazon,BloomBerg,Microsoft,Apple
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        //numsRow=5

        result.add(new ArrayList<Integer>());
        result.get(0).add(1);
        for(int row=1;row < numRows;row++){
            List<Integer> newRow=new ArrayList<>();
            newRow.add(1);
            List<Integer> prevRow=result.get(row-1);
            
            
            for(int i=1;i<row;i++){
                newRow.add(prevRow.get(i-1)+prevRow.get(i));
            }
            newRow.add(1);
            result.add(newRow);
        }
        return result;
    }
}
// Time complexity: O(n^2)
// Space complexity: O(n^2)