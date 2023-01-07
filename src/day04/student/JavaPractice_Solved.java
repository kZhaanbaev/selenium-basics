package day04.student;

public class JavaPractice_Solved {
    /**
     * Note: Create a method for each challenge below
     * 1. Basic: Find sum of elements in an array
     * 2. Basic: Print even and odd numbers from an array based on
     * what user wants to print out
     */

    public static void main(String[] args) {
        Integer[] arr = {2,3,5,7,10,20,4};

        //1. Test
        System.out.println(getSumOfElements(arr));

        //2. Test
        printEvenAndOdd(arr, "even");
        printEvenAndOdd(arr, "odd");
        printEvenAndOdd(arr, "even and odd");
    }

    //1. Solution
    public static int getSumOfElements(Integer[] arr){
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    //2. Solution
    public static void printEvenAndOdd(Integer[] arr, String evenOrOdd){
        if (evenOrOdd.equalsIgnoreCase("even")){
            //using enhanced loop
            for (Integer num: arr){
                if (num % 2 == 0)
                    System.out.println(num);
            }
        } else if (evenOrOdd.equalsIgnoreCase("odd")){
            for (Integer num: arr){
                if (num % 2 == 1)
                    System.out.println(num);
            }
        } else {
            System.out.println("Please enter Even or Odd");
        }
    }
}
