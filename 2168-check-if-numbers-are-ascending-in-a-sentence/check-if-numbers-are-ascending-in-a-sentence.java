class Solution {
    public boolean areNumbersAscending(String s) {
        String str[] = s.split(" ");
        int max=Integer.MIN_VALUE;
        for(String ss:str){
            if(Character.isDigit(ss.charAt(0))){
                int a=Integer.parseInt(ss);
                if(a<=max){
                    return false;
                }
                else{
                    max=a;
                }
            }
        }
        return true;
    }
}