package day17.instructor;

public class _01_BasicMath {
    /**
     *  0. ReadMe file
     *
     *  1. Create 4 methods to handle basic math calculations
     *      add, subtract, divide, multiply
     *  2. Validate all 4 methods in main method with if statements
     *  3. Validate with TestNG
     *  4. ClassTask 1
     */
    public static void main(String[] args) {
        //1. Testing add() method
        _01_BasicMath basicMath = new _01_BasicMath();

        //test data
        int num1 = 30;
        int num2 = 24;

        int expected = num1 + num2;
        int actual = basicMath.add(num1, num2);

        //Validation
        if(expected == actual){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        //2. Testing subtract() method
        //test data
        int num3 = 2;
        int num4 = 49;

        int expected2 = num3 - num4;
        int actual2 = basicMath.subtract(num3, num4);

        //Validation
        if(expected2 == actual2){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }


    }

    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public double divide(double a, double b){
        return a / b;
    }

    public int multiply(int a, int b){
        return a * b;
    }


}
