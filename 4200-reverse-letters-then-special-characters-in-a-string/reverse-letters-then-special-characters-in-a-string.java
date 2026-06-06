class Solution {
    public String reverseByType(String s) {
        List<Character> l = new ArrayList<>();
        List<Character> sc = new ArrayList<>();
        for(char c:s.toCharArray()){
            if(Character.isLetter(c)){
                l.add(c);
            }
            else{
                sc.add(c);
            }
        }
        int i=l.size()-1,j=sc.size()-1;
        StringBuilder sb= new StringBuilder();
         for(char c:s.toCharArray()){
            if(Character.isLetter(c)){
                sb.append(l.get(i--));
            }
            else{
                sb.append(sc.get(j--));
            }
        }
        return sb.toString();
    }
}