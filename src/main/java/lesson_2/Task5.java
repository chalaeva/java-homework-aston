public class Task5 {
    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 10));
    }

    static boolean isSumBetween10And20(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
}
