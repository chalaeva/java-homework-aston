public class Task8 {
    public static void main(String[] args) {
        printWord("Привет!", 3);
    }

    static void printWord(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }
}
