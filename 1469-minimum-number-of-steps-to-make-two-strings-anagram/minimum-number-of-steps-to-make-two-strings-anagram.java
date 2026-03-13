class Solution {
    public int minSteps(String s, String t) {
        Map<Character,Integer> m = new HashMap<>();
        Map<Character,Integer> mt = new HashMap<>();
        int ans=0;
        for(char c:s.toCharArray()){
            m.put(c,m.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            mt.put(c,mt.getOrDefault(c,0)+1);
        }
        for(char c:m.keySet()){
            int a = m.get(c);
            int b = mt.getOrDefault(c,0);
            if(a>b){
                ans+=a-b;
            }
        }
        return ans;
    }
}