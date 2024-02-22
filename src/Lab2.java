import java.util.ArrayList;

public class Lab2 {
    int numberOfCharacters = 3;

    ArrayList<Character> characterList = addCharacters(numberOfCharacters);

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
    public ArrayList<Character> addCharacters(int number){
        ArrayList<Character> listOfChars = new ArrayList<>();
        for (int i = 0; i <number ; i++) {
            listOfChars.add((char)('A'+i));
        }
        return listOfChars;
    }
}
