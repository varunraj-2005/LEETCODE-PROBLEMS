class Solution {
    public int totalWaviness(int num1, int num2) {
        int w=0;
        for(int i=num1;i<=num2;i++){
            if(i<100){
                continue;
            }
            String s=String.valueOf(i);
            for(int j=1;j<s.length()-1;j++){
                if(s.charAt(j-1)-'0'<s.charAt(j)-'0' && s.charAt(j+1)-'0'<s.charAt(j)-'0') w++;
                if(s.charAt(j-1)-'0'>s.charAt(j)-'0' && s.charAt(j+1)-'0'>s.charAt(j)-'0') w++;
            }
        }
        return w;
    }
}