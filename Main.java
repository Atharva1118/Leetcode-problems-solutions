import java.util.*;

public class Main {
    public static void SortColours(int[] nums){
        int i=0;
        int j=nums.length-1;
        while(i<=j){
          if(nums[i]==0){
            i++;
          }else{
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j--;
          }
        }
        for(i=0;i<nums.length;i++){
        System.out.println(nums[i]);
        }
    }
    public static void main(String[] args) {
      int[] nums={0,1,1,1,0,0,1,1};
      System.out.println("Before:  ");
      for(int i=0;i<nums.length;i++){
        System.out.println(nums[i]);
      }
      System.out.println("After:  ");
      SortColours(nums);
      
      
    }
}
