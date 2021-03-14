class Solution {
public:
    int lengthOfLastWord(string s) {
        int word_length = 0;
        if (s.size() == 0) return 0;
        for (int i = s.size() - 1; i >= 0; i--) {
            if (s[i] == ' ') {
                if (word_length == 0) {
                    continue;
                } else {
                    break;
                }
            }
            word_length++;
        }
        return word_length;
    }
};
