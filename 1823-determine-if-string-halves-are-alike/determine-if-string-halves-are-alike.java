class Solution {
    public boolean halvesAreAlike(String s) {
        String s1 = s.substring(0,s.length()/2);
        String s2 = s.substring(s.length()/2,s.length());
        String v ="aeiouAEIOU";
        int c=0,b=0;
        for(char a:s1.toCharArray()){
            if(v.contains(String.valueOf(a))){
                c++;
            }
        }
        for(char a:s2.toCharArray()){
            if(v.contains(String.valueOf(a))){
                b++;
            }
        }
        return c==b;
    }
}