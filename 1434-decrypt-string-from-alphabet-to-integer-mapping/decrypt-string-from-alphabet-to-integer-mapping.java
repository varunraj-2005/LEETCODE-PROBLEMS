class Solution {
    public String freqAlphabets(String s) {
        String str ="";
        for(int i=s.length()-1;i>=0;){
            if(s.charAt(i)=='#'){
                String a = ""+s.charAt(i-2)+s.charAt(i-1);
                int b = Integer.parseInt(a);
                str=(char)(b-1 +'a')+str;
                i-=3;
            }
            else{
                int b = s.charAt(i)-'0';
                str=(char)(b-1 +'a')+str;
                i--;
            }
        }
        return str;
    }
}