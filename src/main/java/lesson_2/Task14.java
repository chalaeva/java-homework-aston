public class Task14 {
    public static void main(String[] args) {
        createArray(5, 2);
    }

    static void createArray(int len, int value) {
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = value;
        }

        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
