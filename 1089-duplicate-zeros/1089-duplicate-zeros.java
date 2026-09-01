class Solution {
    public void duplicateZeros(int[] arr) {
        // Amazon, Google

        int[] des = new int[arr.length];
        int d = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                des[d] = arr[i];
                d++;
            } 
            else {
                des[d] = 0;

                if (d + 1 < des.length) {
                    des[d + 1] = 0;
                }

                d += 2;
            }

            if (d >= des.length) {
                break;
            }
        }

        for (int i = 0; i < des.length; i++) {
            arr[i] = des[i];
        }
    }
}