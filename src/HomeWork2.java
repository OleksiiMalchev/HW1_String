public class HomeWork2 {
    public static void main(String[] args) {
        int countWords = wordsCount(" #45 Java. New day to explore! /// ");
        System.out.println(countWords);
        boolean isPalindrome = isPalindrome("Tenet");
        System.out.println(isPalindrome);
    }

    public static int wordsCount(String message) {
        String[] messageArray = message.split("[-#$%^&!?,/:.0-9\\s]+");
        int numberWord = 0;
        for (String word : messageArray) {
            if (!word.equals("")) numberWord++;
        }
        return numberWord;
    }

    public static boolean isPalindrome(String str) {
        char[] stringToChar = new char[str.length()];
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (stringToChar[i] != stringToChar[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
