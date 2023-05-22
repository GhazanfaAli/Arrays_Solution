// Write a Java program to find the maximum element in an array.

public class MaxiElement {
    public static void main(String argsp[]){

        int arr1[] = {11,12,13,104,29};
        int maximum = arr1[0];
            for (int i = 1; i < arr1.length; i++) {
                if (arr1[i] > maximum) {
                   maximum = arr1[i];
                }
            }
            System.out.println("maxiumum element = " + maximum);

        }
////////////////////////////////////////////////////////////////////////////

 // ==> minimum element
  /*

    int minimum = arr1[0];
            for (int i = 1; i < arr1.length; i++) {
        if (arr1[i] < minimum) {
            minimum= arr1[i];
        }
    }
  System.out.println("maxiumum element = " + minimum);

         */

    }


