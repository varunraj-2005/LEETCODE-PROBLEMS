class Solution {
    public String reverseWords(String s) {
        String sa[] = s.split("\\s+");
        String ans="";
        for(int i=sa.length-1;i>=0;i--){
                String str = new StringBuilder(sa[i]).reverse().toString();
                System.out.println(str);
            ans+=sa[i];
            ans+=" ";
        }
        return ans.trim();
    }
}