package Q74;

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int numRows = matrix.length;
        if(numRows == 0) return false;
        int rowSize = matrix[0].length;
        if(rowSize == 0) return false;
        int totalCells = rowSize * numRows;
        if(totalCells == 1) return target == matrix[0][0];
        int left = 0, right = totalCells - 1;
        while(left != right) {
            int mid = (right + left) / 2;
            int row = (mid / rowSize);
            int column = (mid % rowSize);
            if(matrix[row][column] < target) {
                if(right - left == 1) {
                    return matrix[right / rowSize][right % rowSize] == target;
                } else {
                    left = mid;
                }
            } else if(matrix[row][column] > target) {
                right = mid;
            } else {
                return true;
            }
        }
        return false;
    }


}
