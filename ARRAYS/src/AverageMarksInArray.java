// ==> Calculate the average marks from an array containing marks of all students in physics using a for-each loop.

public class AverageMarksInArray {
    public static void main(String args[]){

        float [] marks = {5.7f, 7.8f, 603.4f, 929.2f, 1020.0f};
        float sum = 0;
        for(float i:marks){
            sum = sum + i;
        }
        System.out.println("average marks =  " + sum/marks.length);

    }
}
