class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;
        int n = matrix[0].length - 1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(matrix[mid][n] > target && matrix[mid][0] > target){
                right = mid - 1;
            }else if (matrix[mid][n] < target && matrix[mid][0] < target){
                left = mid + 1;
            }else{
                int l = 0;
                int r = n;
                
                while(l <= r){
                    int m = l + (r-l)/2;
                    
                    if(matrix[mid][m] < target){
                        l = m + 1;
                    }else if(matrix[mid][m] > target){
                        r = m - 1;
                    }else{
                        return true;
                    }
                }
                return false;
            }
        }

        return false;
    }
}
