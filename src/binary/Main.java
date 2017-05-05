package binary;


public class Main {

    public static int BinarySearch_Rec(int[] array, boolean descendingOrder, int key, int left, int right) {
        int mid = left + (right - left) / 2;

        if (left >= right)
            return -(1 + left);

        if (array[mid] == key) {
            return mid;
        }

        else if ((array[mid] > key) ^ descendingOrder) {
            return BinarySearch_Rec(array, descendingOrder, key, left, mid);
        } else {
            return BinarySearch_Rec(array, descendingOrder, key, mid + 1, right);
        }
    }

    public static int BinarySearch_Rec_Wrapper(int[] array, int element) {
        if (array.length == 0)
            return -1;

        boolean descendingOrder = array[0] > array[array.length - 1];
        return BinarySearch_Rec(array, descendingOrder, element, 0, array.length);
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 10, 1, 0};

        System.out.println(BinarySearch_Rec_Wrapper(arr, 2));
    }

}
