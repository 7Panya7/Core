package src.main.java.homework2.task3;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(searchCoinc("car", "ca6$$#_rtwheel"));
            System.out.println(searchCoinc("cwhl", "cartwheel"));
            System.out.println(searchCoinc("cwhee", "cartwheel"));
            System.out.println(searchCoinc("cartwheel", "cartwheel"));
            System.out.println(searchCoinc("cwheeel", "cartwheel"));
            System.out.println(searchCoinc("lw", "cartwheel"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean searchCoinc(String searchWord, String word) {

        if (searchWord == null || word == null) {
            throw new IllegalArgumentException("Текст отсутствует");
        }

        int searchWordLength = searchWord.length();
        int wordLength = word.length();

        if (searchWordLength == 0 || wordLength == 0) {
            throw new IllegalArgumentException("Длина слова равна 0");
        }

        if (searchWordLength > wordLength) {
            return false;
        }

        int substringIndex = 0;

        for (int i = 0; i < word.length(); i++) {

            if (searchWordLength - substringIndex > wordLength - i) {
                return false;
            }

            if (Character.toLowerCase(word.charAt(i)) == Character.toLowerCase(searchWord.charAt(substringIndex))) {
                substringIndex++;
            }

            if (substringIndex == searchWordLength) {
                return true;
            }
        }
        return false;
    }
}