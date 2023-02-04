package day20_new.instructor;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_TDD {
    //Test Driven Development

    /*
    TDD stands for Test-Driven Development.
    It is a software development approach where tests are written first, before the actual code is written.
    The purpose of writing tests first is to define the behavior and requirements of the code,
    and to ensure that it works as expected. The code is then written to make the tests pass,
    and the process is repeated until the desired functionality is achieved.
    This approach helps to catch bugs early in the development process,
    and leads to more maintainable and reliable code.
     */

    /**
     * 1. write a test case(s) first and then create functionality
     *      Need a functionality that takes a letter and a sentence then
     *      counts how many times that letter was repeated in that sentence.
     *      a. create a test data and expected result
     *      b. create an object of the class and a method name that supposed to
     *      have the functionality implemented in
     *      c. Assert
     *      Note: method will be red initially since it doesn't exist, then we will
     *      create that method step by step to remove red errors.
     */
    @Test
    public void test1(){
        _01_TDD obj = new _01_TDD();

        String testData = "Tech Lead Academy";
        String inputChar = "a";
        int expectedCount = 3;
        int actualCount = obj.getCountOfChar(testData, inputChar);

        Assert.assertEquals(actualCount, expectedCount);
    }

    //Method is created after Test is ready.
    public int getCountOfChar(String txt, String inputChar){
        String[] arr = txt.split("");

        int count = 0;

        for(String each: arr){
            if (each.equalsIgnoreCase(inputChar))
                count++;
        }

        return count;
    }


}
