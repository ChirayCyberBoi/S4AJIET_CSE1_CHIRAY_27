public class Main {
    public static void main(String[] args) {
        int[] arr = {70, 80, 30, 40, 50};
        int min = arr[0];
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Smallest element: " + min);
    }
}
