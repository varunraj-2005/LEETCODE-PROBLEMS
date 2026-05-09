class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] ans = new int [code.length];

        for(int i=0;i<code.length;i++){
            int sum=0;
            if(k>0){
                int s=i+1;
                for(int j=0;j<k;j++){
                    if(s>=code.length) s=s-code.length;
                    sum+=code[s];
                    s++;
                }
            }
            else{
                int s=i-1;
                for(int j=0;j<Math.abs(k);j++){
                    if(s<0) s=s+code.length;
                    sum+=code[s];
                    s--;
                }
            }
            ans[i]=sum;
        }
        return ans;
    }
}