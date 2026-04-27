class Solution {
     public String truncateSentence(String s, int k) {
        return String.join(" ", Arrays.copyOf(s.split(" "), k));
    }
}