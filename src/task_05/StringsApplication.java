package task_05;

public class StringsApplication {
    public static void main(String[] args) {

        // 1 Создайте строку через new - I study Basic Java!

        String basicString = new String("I study Basic Java!");
        System.out.println("1. Basic string: " + basicString);


        // 2 Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1

        StringsUtil stringsUtil = new StringsUtil();
        stringsUtil.test_method(basicString);


        // 3 Распечатать последний символ строки. Используем метод String.charAt().

        char lastSymbol = stringsUtil.lastSymbol(basicString);
        System.out.println("3. The last symbol of the string is: " + lastSymbol);


        // 4 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().

        String substringToFind = "Java";
        boolean if_contains = stringsUtil.stringContainsSubstring(basicString, substringToFind);
        System.out.println("4. The string \"" + basicString + "\" contains substring \"" + substringToFind + "\": " + if_contains);


        // 5 Заменить все символы “а” на “о”.

        char oldSymbol = 'a', newSymbol = 'o';
        String newString1 = stringsUtil.replaceSymbol(basicString, oldSymbol, newSymbol);
        System.out.println("5. New string after peplacing \"" + oldSymbol + "\" with  \"" + newSymbol + "\": " + newString1);


        // 6 Преобразуйте строку к верхнему регистру.

        System.out.println("6. String in upper case: " + stringsUtil.toUpperCase(basicString));


        // 7 Преобразуйте строку к нижнему регистру.

        System.out.println("7. String in lower case: " + stringsUtil.toLowerCase(basicString));


        // 8 Вырезать строку Java c помощью метода String.substring().

        String substringToCut = "Java";
        String newString2 = stringsUtil.cutSubstring(basicString, substringToCut);
        System.out.println("8. New string after cutting substring: " + newString2);

    }

}
