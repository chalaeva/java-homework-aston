public class Task9 {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2024));
    }

    static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        if (year % 4 == 0) return true;
        return false;
    }
}
