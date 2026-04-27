class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> m = new HashMap<>();
        for(char c:s.toCharArray()){
            m.put(c,m.getOrDefault(c,0)+1);
        }
        int i=0;
        for(char c:m.keySet()){
            if(i==0) i=m.get(c);
            if(i!=m.get(c)) return false;
        }
        return true;
    }
}