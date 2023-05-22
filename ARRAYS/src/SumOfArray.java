// ==> 1. Create an array of 5 floats and calculate their sum.

public class SumOfArray {
    public static void main(String args[]){
        float [] marks = {1.0f, 2.0f, 3.0f, 4.0f, 5.1f};
        float sum = 0.0f;
        for(float i : marks){
            sum += i;
        }
        System.out.println("sum = "+  sum);

    }
}
