class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int ka) {
        int m=grid.length,n=grid[0].length;
        int arr[][]=new int[m][n];
        for(int i=0;i<ka;i++){
            if(i%2==0){
                for(int j=0;j<m;j++){
                    for(int k=0;k<n;k++){
                        if(k==n-1 && j!=m-1){
                            arr[j+1][0]=grid[j][k];
                        }
                        else if(j==m-1 && k==n-1){
                            arr[0][0]=grid[j][k];
                        }
                        else arr[j][k+1]=grid[j][k];
                    }
                }
            }
            else{
                for(int j=0;j<m;j++){
                    for(int k=0;k<n;k++){
                        if(k==n-1 && j!=m-1){
                            grid[j+1][0]=arr[j][k];
                        }
                        else if(j==m-1 && k==n-1){
                            grid[0][0]=arr[j][k];
                        }
                        else grid[j][k+1]=arr[j][k];
                    }
                }
            }
        }
        List<List<Integer>> l = new ArrayList<>();
       
            if(ka%2==0){
                for(int i=0;i<m;i++){
                    List<Integer> ll = new ArrayList<>();
                    for(int j=0;j<n;j++){
                        ll.add(grid[i][j]);
                    }
                    l.add(new ArrayList(ll));
                }
            }
            else{
                for(int i=0;i<m;i++){
                    List<Integer> ll = new ArrayList<>();
                    for(int j=0;j<n;j++){
                        ll.add(arr[i][j]);
                    }
                    l.add(new ArrayList(ll));
                }
            }
        return l;
    }
}