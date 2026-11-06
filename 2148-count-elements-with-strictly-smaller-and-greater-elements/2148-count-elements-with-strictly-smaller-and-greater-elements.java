class Solution {
    public int countElements(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        int count=0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>min && arr[i]<max){
                count++;
            }
        }
        return count;
    }
}
