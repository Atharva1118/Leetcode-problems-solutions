class Solution {
    public String addBinary(String a, String b) {
        //Google,Meta,BloomBerg,Apple,Microsoft,,Amazon
        // Input: 
        //  a = "11" --->3
        //  b = "1"  --->1
        // Output: "100" --->4

        if(a.length() < b.length()){
            return addBinary(b,a);
        }
        int m=a.length();
        int n=b.length();
        int j = n - 1;
        int carry=0;
        StringBuilder result=new StringBuilder();
        for(int i=m-1;i>=0;i--,j--){
            int sum=carry;
            if(a.charAt(i)=='1'){
                sum+=1;
            }
            if(j>=0 && b.charAt(j)=='1'){
                sum+=1;
            }
            result.append(sum%2);
            carry=sum/2;
            
        }

        if(carry==1){
            result.append(1);
        }
        result.reverse();
        return result.toString();
    }

    //Time Complexity=O(max(m,n))
    //Space complexity: O(1)
}