class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        String s = "aeiou";
        int ans = 0;
        for(int i=left;i<=right;i++){
            if(s.contains(String.valueOf(words[i].charAt(0)))){
                if(s.contains(String.valueOf(words[i].charAt(words[i].length()-1)))){
                    ans++;
                }
            }
        }
        return ans;
    }
}