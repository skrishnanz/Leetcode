class Solution {
    public boolean squareIsWhite(String n) {
        int l=n.charAt(1)-'h';
        int a=n.charAt(0)-'8';
        boolean r=(l+a)%2!=0;return r;
    }
}