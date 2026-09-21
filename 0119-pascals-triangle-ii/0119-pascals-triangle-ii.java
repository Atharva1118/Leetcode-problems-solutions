class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        result.add(new ArrayList<Integer>());
        result.get(0).add(1);
        for(int row=1;row<rowIndex+1;row++){
            List<Integer> newRow=new ArrayList<>();
            newRow.add(1);
            List<Integer> prevRow=result.get(row-1);
            
            
            for(int i=1;i<row;i++){
                newRow.add(prevRow.get(i-1)+prevRow.get(i));
            }
            newRow.add(1);
            result.add(newRow);
        }
        return result.get(rowIndex);
    }
}