import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] words = {"cool", "amazing","absolutely","small","right","just","obviously","unattended"};
        //String word = getWord(words);
        String word = "krumpli";
        String testWord ="";
        Scanner scanner = new Scanner(System.in);
        String character = scanner.nextLine();
        System.out.println(character);
        testWord = getCharacter(character,word,testWord);//" s  s"
        character = "p";
        testWord = getCharacter(character,word,testWord);
        System.out.println(testWord);


        /*String word = "bannanas";
        String guess = "n";
        int index = word.indexOf(guess);

        while (index >= 0) {
            System.out.println(index);
            index = word.indexOf(guess, index + 1);
        }*/

    }

    public static String getWord(String[] words) {
        Random random = new Random();
        int number = random.nextInt(words.length- 1 + 1) + 0;
        return words[number];
    }

    public static String getCharacter(String guess,String word,String testWord){
        if (testWord.length()==0) {
            for (int i =0; i<word.length();i++){
                testWord += " ";
            }
        }
        int index = word.indexOf(guess);
        String newString = testWord;
        ArrayList<Integer> find = new ArrayList<>();
        while (index >= 0) {
            //System.out.println(index);
            find.add(index);
            index = word.indexOf(guess, index + 1);
        }
        System.out.println(find);
        for (Integer element: find) {
            newString = newString.substring(0,element)+ guess + newString.substring(element+1,newString.length());
        }

        return newString;
    }


}
