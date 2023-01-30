package task_06.subtask01;

public class WordsUserInteraction {

    String askUserForWordInRequredFormat(String message, String errorMessage){

        String userWord = "";
        boolean inputIsCorrect = false;

        WordsUtil wordsUtil = new WordsUtil();
        WordsInput wordsInput = new WordsInput();

        while (!inputIsCorrect){
            userWord = wordsInput.inputString(message);
            inputIsCorrect = wordsUtil.hasEvenLength(userWord);
            if (!inputIsCorrect)
                System.out.println(errorMessage);
        }

        return userWord;

    }

}
