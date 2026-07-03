class Solution {
    static String[] s={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String d) {
        List<String> l = new ArrayList<>();
        recursion(l,d,new StringBuilder(),0);
        return l;
    }
    public static void recursion(List<String> l , String d, StringBuilder sb,int i){
        if(sb.length()==d.length()){
            l.add(sb.toString());
            return;
        }
        char c = d.charAt(i);
        int a = (int)c-'0';
        String ss = s[a];
        for(int j=0;j<ss.length();j++){
            sb.append(ss.charAt(j));
            recursion(l,d,sb,i+1);
            sb.deleteCharAt(sb.length()-1);
        } 
    }
}