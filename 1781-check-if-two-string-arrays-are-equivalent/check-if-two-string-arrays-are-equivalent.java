class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder build = new StringBuilder();
        StringBuilder build1 = new StringBuilder();
        for(int i = 0; i<word1.length; i++){
          String val = word1[i];
          build.append(val);
        }
         for(int i = 0; i<word2.length; i++){
          String val1 = word2[i];
          build1.append(val1);
        }       
     return build.toString().equals(build1.toString());
    }
}