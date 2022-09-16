package day17.student;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_ClassTask_SolvedTest extends _02_ClassTask_Solved{

    @Test
    public void testReturnInitialsInCaps(){
        _02_ClassTask_Solved task = new _02_ClassTask_Solved();

        String testData = "tech lead academy";
        String expected = "TLA";
        String actual = task.returnInitialsInCaps(testData);

        Assert.assertEquals(actual, expected);
    }


    @Test
    public void testReturnInitialsInCaps2(){
        _02_ClassTask_Solved task = new _02_ClassTask_Solved();

        String testData = "blue";
        String expected = "B";
        String actual = task.returnInitialsInCaps(testData);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testReturnInitialsInCaps3(){
        _02_ClassTask_Solved task = new _02_ClassTask_Solved();

        String testData = "tech lead 345test academy";
        String expected = "TL3A";
        String actual = task.returnInitialsInCaps(testData);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testReturnInitialsInCaps4(){
        _02_ClassTask_Solved task = new _02_ClassTask_Solved();

        String testData = null;
        String expected = "invalid input";
        String actual = task.returnInitialsInCaps(testData);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testReturnInitialsInCaps5(){
        _02_ClassTask_Solved task = new _02_ClassTask_Solved();

        String testData = "";
        String expected = "invalid input";
        String actual = task.returnInitialsInCaps(testData);

        Assert.assertEquals(actual, expected);
    }
}