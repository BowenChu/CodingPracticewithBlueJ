
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        String result= baseValue.concat(valueToBeAdded);
        return result;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
                char temp;
                char[] array= valueToBeReversed.toCharArray();
        for (int start = 0, end = array.length - 1; start <= end; start++, end--) {
            temp = array[start];
            array[start]=array[end];
            array[end]=temp;
            
        }
        
        return new String(array);
        
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        char[] array= word.toCharArray();
       
        return array[array.length/2];
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        char c;
        String result= "";
        for(int i =0; i< value.length();i++){
            c= value.charAt(i);
            if(!(c==charToRemove)){
                result+=c;}}
        return result;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        for(int i =sentence.length()-1; i>=0;i--){
            
            if(Character.isWhitespace(sentence.charAt(i))){
                return sentence.substring(i+1,sentence.length());}}
        return sentence;
    }
}
