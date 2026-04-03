class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        Map<String,Integer> m = new TreeMap<>();
        for(List<String> l:responses){
            Set<String> s = new HashSet<>();
            for(String i:l){
                s.add(i);
            }
            for(String i:s){
                m.put(i,m.getOrDefault(i,0)+1);
            }
        }
        int max=0;
        String str="";
        for(String s:m.keySet()){
            if(m.get(s)>max){
                max=m.get(s);
                str=s;
            }
        }
        return str;
    }
}