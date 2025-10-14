public class Task6 {
    public static void main(String[] args) {
        printPositiveOrNegative(-3);
    }

    static void printPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
}
