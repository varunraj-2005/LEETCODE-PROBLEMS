class Solution {
    public String removeTrailingZeros(String num) {
        char c[] = num.toCharArray();
        for(int i=c.length-1;i>=0;i--){
            if(c[i]=='0'){
                c[i]='-';
            }
            else{
                break;
            }
        }
        String s = "";
        for(int i=0;i<c.length;i++){
            if(c[i]!='-'){
                s+=c[i];
            }
            else{
                break;
            }
        }
        return s;
    }
}