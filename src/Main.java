import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        printArray(sortNumber(getIntegers(5)));
    }

    public static int[] getIntegers(int integers){

        int[] array = new int[integers];

        System.out.println("Enter numbers\r");
        for(int i =0; i < array.length; i++ ){
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array){
        for(int i=0; i < array.length; i++) {
            System.out.println(" Position " + i + " " +" is number = " + array[i]);
        }

    }

    public static int[] sortNumber(int[] array){

//        int[] sortedArray = new int[array.length];
//
//        for(int i =0; i < array.length; i++){
//            sortedArray[i] = array[i];
//        }

        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i =0; i < sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }

        }
        return sortedArray;
    }
}
