class Solution {
    public int countPoints(String s) {
        Map<Character,String> m = new HashMap<>();
        for(int i=0;i<s.length()-1;i+=2){
            if(m.containsKey(s.charAt(i+1))){
                m.put(s.charAt(i+1),m.get(s.charAt(i+1))+s.charAt(i));
            }
            else{
            m.put(s.charAt(i+1),String.valueOf(s.charAt(i)));}
        }
        int ans=0;
        for(String str:m.values()){
            if(str.contains("R") && str.contains("B") && str.contains("G")){
                ans++;
            }
        }
        return ans;
    }
}