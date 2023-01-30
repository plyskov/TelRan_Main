package task_06.subtask01;

public class WordsApp {
    public static void main(String[] args) {

        String[] userWords = new String[2];
        WordsUserInteraction interaction = new WordsUserInteraction();
        WordsUtil wordsUtil = new WordsUtil();

        // Disclaimer
        System.out.println("For the correct action please note that you are to input 2 words with EVEN amount of symbols");

        // Input session with verification.
        for (int i = 0; i < userWords.length; i++) {
            String infoMessage = "Please input the word N " + (i+1) + ":";
            String errorMessage = "Wrong input: the odd amount of symbols (even requred)!";
            userWords[i] = interaction.askUserForWordInRequredFormat(infoMessage, errorMessage);
        }

        // Return result
        String resultWord = wordsUtil.firstHalf(userWords[0]) + wordsUtil.secondHalf(userWords[1]);
        System.out.println("The result word is: " + resultWord);

    }
}
