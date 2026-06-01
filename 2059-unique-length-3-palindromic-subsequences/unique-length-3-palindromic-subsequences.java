class Solution {
    public int countPalindromicSubsequence(String s) {
        int count=0;
        for(char c='a';c<='z';c++){
            int a = s.indexOf(c);
            int b = s.lastIndexOf(c);
            if(a!=-1 && b-a>1){
                Set<Character> set = new HashSet<>();
                for(int i=a+1;i<b;i++){
                    set.add(s.charAt(i));
                }
                count+=set.size();
            }
        }
        return count;
    }
}