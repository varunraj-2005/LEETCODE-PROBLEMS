class Solution {
    public String countAndSay(int n) {
        int i=1;
        String s = "1";
        while(i<n){
            StringBuilder sb = new StringBuilder();
            int a = 1;
            for(int j=1;j<s.length();j++){
                if(s.charAt(j)==s.charAt(j-1)){
                    a++;
                }
                else{
                    sb.append(a);
                    sb.append(s.charAt(j-1));
                    a=1;
                }
            }
            i++;
            sb.append(a);
            sb.append(s.charAt(s.length()-1));
            s = sb.toString();
        }
        return s;
    }
}