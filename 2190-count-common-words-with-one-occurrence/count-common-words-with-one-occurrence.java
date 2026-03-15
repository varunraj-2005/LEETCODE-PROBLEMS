class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String,Integer> m1 = new HashMap<>();
        Map<String,Integer> m2 = new HashMap<>();
        for(String s:words1){
            m1.put(s,m1.getOrDefault(s,0)+1);
        }
        for(String s:words2){
            m2.put(s,m2.getOrDefault(s,0)+1);
        }
        int a =0;
        for(String s:m1.keySet()){
            if(m2.containsKey(s)){
                if(m1.get(s)==1 && m2.get(s)==1){
                    a++;
                }
            }
        }
        return a;
    }
}