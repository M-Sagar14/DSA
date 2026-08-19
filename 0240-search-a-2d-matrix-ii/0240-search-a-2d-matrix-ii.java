class Solution {
    public boolean searchMatrix(int[][] m, int target) {
        int n=m.length;
        int m1=m[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m1;j++){
                if(m[i][j]==target){
                    return true;

                }
            }
        }
        return false;
    }
}