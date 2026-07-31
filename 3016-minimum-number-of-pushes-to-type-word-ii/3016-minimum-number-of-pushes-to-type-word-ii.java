class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        Arrays.sort(freq);
        int total = 0;
        int n = 26;
        for (int i = 0; i < n; i++) {
            int count = freq[n - 1 - i]; // descending order
            total += count * (i / 8 + 1);
        }
        return total;
    }
}