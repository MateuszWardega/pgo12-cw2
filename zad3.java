public class zad3 {

    public static int[] rotateArray(int[] array, int positions) {
        int n = array.length;
        if (n == 0 || positions == 0 || positions % n == 0) {
            return array;
        }

        positions = positions % n;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[(i + positions) % n] = array[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3};

        System.out.println(java.util.Arrays.toString(rotateArray(array1, 2))); // [4, 5, 1, 2, 3]
        System.out.println(java.util.Arrays.toString(rotateArray(array2, 3))); // [1, 2, 3]
    }
}
