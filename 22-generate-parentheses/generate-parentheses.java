class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l = new ArrayList<>();
        per(l,new StringBuilder(),0,0,n);
        return l;
    }
    public static void per(List<String> l,StringBuilder sb,int o,int c,int n){
        if(sb.length()==n*2){
            l.add(sb.toString());
        }
        if(o<n){
            sb.append('(');
            per(l,sb,o+1,c,n);
            sb.deleteCharAt(sb.length()-1);
        }
        if(c<o){
            sb.append(')');
            per(l,sb,o,c+1,n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}