package Examps;

import java.util.Arrays;

public class Examp03 {
    public static void main(String[] args) {
//        int[] numArray= {12,13,12,15,0, -1};
//        Arrays.sort(numArray);
//        System.out.println(numArray[numArray.length-2]);


        int[] array= {1000,200,222,11};
        int largest=array[0];                           // largest = 1000
        int secondLargest=0;                            // secondLargest = 222

        for(int i=0; i<array.length; i++) {
            if (array[i]>largest) {
                secondLargest=largest;
                largest=array[i];
            }
            else if (array[i]>secondLargest && array[i]!=largest){
                secondLargest=array[i];
            }
        }
        System.out.println("The largest number=" + largest + " and secondLargest= " + secondLargest);
    }
}
