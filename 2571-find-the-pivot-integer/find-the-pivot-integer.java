class Solution {
    public int pivotInteger(int n) {
      if(n==1) return 1;
       int p=1;
       while(p<n){
        int ls =0;
        int rs = 0;
        for(int i=1;i<=p;i++){
            ls+=i;
        }
        for(int j=p;j<=n;j++){
            rs+=j;
        }
        if(ls==rs){
            return p;
        }
        p++;
       } 
       return -1;
    }
}