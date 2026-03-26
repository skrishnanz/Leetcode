class Solution{
    public int uniqueMorseRepresentations(String[] words){
        String[] alphabet = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-.."
                ,"--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        return(int) Arrays.stream(words).map(word -> word.chars().mapToObj(character -> alphabet[character - 'a'])
                .collect(Collectors.joining())).distinct().count();
    }
}