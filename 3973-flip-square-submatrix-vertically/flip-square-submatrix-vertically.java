class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int[][] ans = new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
              ans[i][j]=grid[i][j];
            }
        }
        for(int i=0;i<k;i++){
            for(int j=0;j<k;j++){
                ans[x+i][y+j]=grid[x+k-1-i][y+j];
            }
        }
        return ans;
    }
}