package Tests;
import Algos.SortArrayOfZeroOnes;
import org.junit.Assert;
import org.junit.Test;


public class SortArrayOfZeroOnesTest {


    @Test
    public void sortArray(){
        SortArrayOfZeroOnes sortArrayOfZeroOnes = new SortArrayOfZeroOnes();

        int arr[] = {0, 1, 1, 0, 0, 1, 1, 1, 0};
        sortArrayOfZeroOnes.SortArray(arr);
        int expectedValue [] = {0, 0, 0, 0, 1, 1, 1, 1, 1};
        Assert.assertArrayEquals(arr, expectedValue);

    }

    @Test
    public void sortEmptyArray(){
        SortArrayOfZeroOnes sortArrayOfZeroOnes = new SortArrayOfZeroOnes();

        int arr[] = {};
        sortArrayOfZeroOnes.SortArray(arr);
        int expectedValue [] = {};
        Assert.assertArrayEquals(arr, expectedValue);

    }

    @Test
    public void sortOneElementArray(){
        SortArrayOfZeroOnes sortArrayOfZeroOnes = new SortArrayOfZeroOnes();

        int arr[] = {0};
        sortArrayOfZeroOnes.SortArray(arr);
        int expectedValue [] = {0};
        Assert.assertArrayEquals(arr, expectedValue);

    }


}
