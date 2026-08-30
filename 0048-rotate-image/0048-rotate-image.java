class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i = 0; i < matrix.length; i++) {

            int j = matrix[i].length - 1;
            int k = 0;

            while(k < j) {

                int temp = matrix[i][k];
                matrix[i][k] = matrix[i][j];
                matrix[i][j] = temp;

                k++;
                j--;
            }
        }
    }
}