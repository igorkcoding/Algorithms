package Algos;

public class SortArrayOfZeroOnes {

//Given an array of integers.
    //All elements are either ones or zeros inside the array. Your goal is to order the array in ascending order.

    // [1, 0, 0, 0, 1, 1]
    // [ 1, 1, 1, 0, 0, 0]

    public void SortArray(int arr[]) {

        //will know how many ones are in the array

        int count = 0;

        for (int element : arr) {

            count += element;
        }
        int endOfZeroIndex = arr.length - count;


        for (int i = 0; i < endOfZeroIndex; i++) {

            arr[i] = 0;

        }

        for (int i = endOfZeroIndex; i < arr.length; i++) {

            arr[i] = 1;

        }
    }
}