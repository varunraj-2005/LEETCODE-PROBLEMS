class Solution {
    public String majorityFrequencyGroup(String s) {
          int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int[] count = new int[101]; 

        for (int f : freq) {
            if (f > 0) count[f]++;
        }

        int maxSize = 0, bestFreq = 0;

        for (int f = 1; f <= 100; f++) {
            if (count[f] > maxSize || (count[f] == maxSize && f > bestFreq)) {
                maxSize = count[f];
                bestFreq = f;
            }
        }

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            if (freq[i] == bestFreq) {
                res.append((char)(i + 'a'));
            }
        }

        return res.toString();
    }
}