package Algos;

public class SumElementsInArray {


    //You are given an array of integers. Please return their sum of all elements.


    public int sumElements(int arr[]){

        int sum = 0;

        for (int element: arr ){
            sum += element;

        }
        return sum;

    }

}


//How much time does the execution take?
// 1. Hardware?
// 2. Other processes in background
// 3 /Programming language
//Number of operations

//Runtime complexity
// n + 2 => 0(n) -> linear time
//n - size of an input
//0 - time

//Memory complexity is O(1) does not rely on the input -- constant time
//Doesn't matter if your array has 10 elements or billion elements


