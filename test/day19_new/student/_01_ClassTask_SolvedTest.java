package day19_new.student;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_ClassTask_SolvedTest extends _01_ClassTask_Solved {

    //Test case 1: General test case with a string that contains a few words.
    @Test
    public void testReturnInitialsInCaps(){
        _01_ClassTask_Solved task = new _01_ClassTask_Solved();

        String testData = "tech lead academy";
        String expected = "TLA";
        String actual = task.returnInitialsInCaps(testData);

        Assert.assertEquals(actual, expected);
    }

    //Test case 2: input only 1 word string.
    @Test
    public void testReturnInitialsInCaps2(){
        _01_ClassTask_Solved task = new _01_ClassTask_Solved();

        String testData = "blue";
        String expected = "B";
        String actual = task.returnInitialsInCaps(testData);

        Assert.assertEquals(actual, expected);
    }

    //Test case 3: include numbers.
    @Test
    public void testReturnInitialsInCaps3(){
        _01_ClassTask_Solved task = new _01_ClassTask_Solved();

        String testData = "tech lead 345test academy";
        String expected = "TL3A";
        String actual = task.returnInitialsInCaps(testData);

        Assert.assertEquals(actual, expected);
    }

    //Test case 4: what if input is a null.
    @Test
    public void testReturnInitialsInCaps4(){
        _01_ClassTask_Solved task = new _01_ClassTask_Solved();

        String testData = null;
        String expected = "invalid input";
        String actual = task.returnInitialsInCaps(testData);

        Assert.assertEquals(actual, expected);
    }


    //Test case 5: if input is an empty string.
    @Test
    public void testReturnInitialsInCaps5(){
        _01_ClassTask_Solved task = new _01_ClassTask_Solved();

        String testData = "";
        String expected = "invalid input";
        String actual = task.returnInitialsInCaps(testData);

        Assert.assertEquals(actual, expected);
    }
}