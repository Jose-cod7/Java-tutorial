package chapter8;

public class TextProcessor {

    public static void main(String args[]){

        //countWords("I love Java language a his power");
        // reverseString("SKYSCANNER!");
        addSpaces("HelloThere!It'sMePepe");

        }

    /**
     * Splits a string into an array by tokenizing it.
     * Count words and prints them
      * @param text Full string to be split
     */
    public static void countWords(String text) {
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words", numberOfWords);
        System.out.println(message);

        for(int i = 0; i<numberOfWords; i++){
            System.out.println(words[i]);
        }
    }

    /**
     * Prints a string in reverse order
     * @param text string to reverse
     */
    public static void reverseString(String text){
        for(int i = text.length() - 1; i >= 0; i-- ){
            System.out.print(text.charAt(i));
        }
        /* easier way to reverse a string!
         var reverseString = new StringBuilder(text);
         System.out.println(reverseString.reverse());*/
    }

    public static void addSpaces(String text) {
        var modifiedText = new StringBuilder(text);
        for (int i = 0; i<modifiedText.length(); i++){
            if(i!= 0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }

        System.out.println(modifiedText);
    }
}

