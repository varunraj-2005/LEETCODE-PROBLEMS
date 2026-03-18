class Solution {
    public int smallestNumber(int n) {
        int ans=0;
        String s = "1";
        while(ans<n){
            ans = Integer.parseInt(s,2);
            s+="1";
        }
        return ans;
    }
}