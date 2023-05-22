// ==> Write a Java program to find whether an array is sorted or not.

public class ArraySortedOrNot {
    public static void main(String args[]) {
        int[] arr = {4,3,2,1};
        boolean isAscendingSorted = true;
        boolean isDescendingSorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isAscendingSorted = false;
            } else if (arr[i] < arr[i + 1]) {
                isDescendingSorted = false;
            }
        }

        if (isAscendingSorted) {
            System.out.println("The array is sorted in ascending order");
            System.out.println("The array is not sorted in descending order");

        } else if (isDescendingSorted) {
            System.out.println("The array is sorted in descending order");
            System.out.println("The array is not sorted in ascending order");
        } else {
            System.out.println("The array is not sorted");
        }
    }
}
