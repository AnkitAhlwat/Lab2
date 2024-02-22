// Student Name: Ankit Ahlwat
// Student ID: A01317232
// Set: 3M
import java.util.ArrayList;
public class Lab2 {
//    These constants are used for scalability instead of hardcoding string 'ABC'.
    int numberOfCharacters = 3;

    ArrayList<Character> characterList = addCharacters(numberOfCharacters);

    /**
     * Generates all palindrome sequences of length n.
     */
    public ArrayList<String> generatePalindromeSequences (int number){
        ArrayList<String> palindromes = new ArrayList<>();
        if (number == 0){
            return new ArrayList<>();
        }
        if (number == 1){

            for (Character character : characterList) {
                palindromes.add(character.toString());
            }
            return palindromes;
        }
        if (number == 2){

            for (Character character : characterList) {
                palindromes.add(character.toString()+ character);
            }
            return palindromes;
        }
            for (String palindrome : generatePalindromeSequences(number-2)) {
                for (Character character : characterList) {
                    palindromes.add(character + palindrome + character);
                }
            }
        return palindromes;
    }

    /**
     * A nice method to add characters based of Unix ASCII values.
     * @param number The number of characters to add starting from 'A'
     * @return An ArrayList of characters.
     */
    public ArrayList<Character> addCharacters(int number){
        ArrayList<Character> listOfChars = new ArrayList<>();
        for (int i = 0; i <number ; i++) {
            listOfChars.add((char)('A'+i));
        }
        return listOfChars;
    }

    /**
     * Donut
     */
    public ArrayList<String> anotherMethod(int n, int numColours){
        numberOfCharacters = numColours;
        characterList = addCharacters(numberOfCharacters);
        return generatePalindromeSequences(n);
    }
}
