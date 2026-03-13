class Solution {
    public int countGoodSubstrings(String s) {
        int ans=0;
        for(int i=0;i<s.length()-2;i++){
            String a = s.substring(i,i+3);
            if(distinct(a)){
                ans++;
            }
        }
        return ans;
    }
    public static boolean distinct(String s){
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
        }
        return count==0;
    }
}