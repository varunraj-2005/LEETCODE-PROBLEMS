class Solution {
    public int numberOfSpecialChars(String word) {
        Map<Character, Integer> m = new HashMap<>();
        for(char c:word.toCharArray()){
            if(Character.isUpperCase(c)){
                char a = Character.toLowerCase(c);
                if(word.contains(String.valueOf(a))){
                   m.put(a,1);
                }
            }
            if(Character.isLowerCase(c)){
                char a = Character.toUpperCase(c);
                if(word.contains(String.valueOf(a))){
                    m.put(c,1);
                }
            }
        }
        return m.size();
    }
}