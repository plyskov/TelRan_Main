package task_06.subtask01;

public class WordsUtil {

    boolean hasEvenLength(String word){
        return (word.length() % 2 == 0);
    }

    String firstHalf(String word) {
        return word.substring(0, word.length() / 2);
    }

    String secondHalf(String word) {
        return word.substring(word.length() / 2);
    }

}
