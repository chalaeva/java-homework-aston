public class Main {

    public static void main(String[] args) {

        // Task 1
        printThreeWords();

        // Task 2
        checkSumSign();

        // Task 3
        printColor();

        // Task 4
        compareNumbers();

        // Task 5
        System.out.println("Сумма от 10 до 20: " + isSumBetween10And20(7, 8));

        // Task 6
        printPositiveOrNegative(-5);

        // Task 7
        System.out.println("Число отрицательное: " + isNegative(-3));

        // Task 8
        printWordNTimes("Привет!", 3);

        // Task 9
        System.out.println("2024 високосный? " + isLeapYear(2024));

        // Task 10
        int[] arr10 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        flipArray(arr10);

        // Task 11
        fillArray100();

        // Task 12
        int[] arr12 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyLessThanSix(arr12);

        // Task 13
        fillDiagonal(5);

        // Task 14
        int[] arr14 = createArray(5, 7);
        for (int i = 0; i < arr14.length; i++) {
            System.out.print(arr14[i] + " ");
        }
        System.out.println();
    }

    // 1
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // 2
    static void checkSumSign() {
        int a = 5;
        int b = -8;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // 3
    static void printColor() {
        int value = 50;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // 4
    static void compareNumbers() {
        int a = 10;
        int b = 20;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5
    static boolean isSumBetween10And20(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // 6
    static void printPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // 7
    static boolean isNegative(int x) {
        return x < 0;
    }

    // 8
    static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }

    // 9
    static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }

    // 10
    static void flipArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 11
    static void fillArray100() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 12
    static void multiplyLessThanSix(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 13
    static void fillDiagonal(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            arr[i][i] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 14
    static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
