package task_05;

public class StringsUtil {

    public void test_method(String myString){
        // Method is doing nothing
        System.out.println("2. I'm a new method and i've received the string: \"" + myString + "\"");
    }

    public char lastSymbol(String stringToProcess){
        return stringToProcess.charAt(stringToProcess.length() - 1);
    }

    public boolean stringContainsSubstring(String stringToProcess, String substringToFind){
         return stringToProcess.contains(substringToFind);
    }

    public String replaceSymbol(String stringToProcess, char oldSymbol, char newSymbol){
        return stringToProcess.replace(oldSymbol, newSymbol);
    }

    public String toUpperCase(String stringToProcess){
        return stringToProcess.toUpperCase();
    }

    public String toLowerCase(String stringToProcess){
        return stringToProcess.toLowerCase();
    }

    public String cutSubstring(String stringToProcess, String substringToCut){
        int indexOfSubstring = stringToProcess.indexOf(substringToCut);
        return stringToProcess.substring(0, indexOfSubstring) + stringToProcess.substring(indexOfSubstring + substringToCut.length());
    }

}
