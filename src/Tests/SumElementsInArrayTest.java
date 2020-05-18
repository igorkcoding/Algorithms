package Tests;

import Algos.SumElementsInArray;
import org.junit.Assert;
import org.junit.Test;

public class SumElementsInArrayTest {


    @Test
public void testsumArray() {

        SumElementsInArray sumElementsInArray = new SumElementsInArray();
    int array [] = {3, 4 ,2 ,3 ,2 ,1};
    int expectedResult = 15;
    int actualResult = sumElementsInArray.sumElements(array);
    Assert.assertEquals(expectedResult,actualResult);

}

    @Test
    public void testsumEmptyArray() {

        SumElementsInArray sumElementsInArray = new SumElementsInArray();
        int array [] = {};
        int expectedResult = 0;
        int actualResult = sumElementsInArray.sumElements(array);
        Assert.assertEquals(expectedResult,actualResult);

    }

    @Test
    public void testsumOneArray() {

        SumElementsInArray sumElementsInArray = new SumElementsInArray();
        int array [] = {2};
        int expectedResult = 2;
        int actualResult = sumElementsInArray.sumElements(array);
        Assert.assertEquals(expectedResult,actualResult);

    }

}
