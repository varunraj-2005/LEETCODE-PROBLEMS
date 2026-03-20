class Solution {
    public boolean doesAliceWin(String s) {
        for(char c:s.toCharArray()){
           if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u' ||
           c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){return true;}
        }
        return false;
    }
}