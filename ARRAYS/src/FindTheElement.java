// ==> Write a program to find out whether a given integer is present in an array or not.

public class FindTheElement {
    public static void main(String args[]){
        int arr1[] = {3,4,5,1,2};
        boolean found = false;
        int num1 = 5;
        for(int i = 0; i<5; i++){
        if(arr1[i] == num1){
            found = true;
        }
        }
        if(found){
            System.out.println("element is present in the arr1");
        }
        else{
            System.out.println("element is not present in the arr1");
        }
    }

}
