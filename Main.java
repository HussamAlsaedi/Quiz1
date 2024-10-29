import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        * Write a Java program that accept three numbers
        *  from the user and print the largest number .
         */
/*
        System.out.println("Please Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Please Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Please Enter third number: ");
        int num3 = sc.nextInt();
        if(num1 > num2 && num1 > num3){
            System.out.println("largest number: "+num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("largest number: "+num2);
        }else if (num3 > num1 && num3 > num2) {
            System.out.println("largest number: "+num3);
        }*/

//        -------------- 2 ----------------------

        /*
        * Write a Java program that accept a String and a number from the user,then
        *  print the character in the given index .*/
        /*System.out.println("Please enter number of index");
        int number_index = sc.nextInt();
        System.out.println("Please enter any word ");
        String word = sc.next();

        String[] words = new String[word.length()];
        for (int i = 0; i < words.length; i++){
            words[i] = word.substring(i, i+1);
        }
        System.out.println(words[number_index]);*/


        // -------------    3 -----------

        /* Write a program to enter the
        numbers till the user wants and at the end it should display the sum entered .*/
       /* System.out.println("Please enter numbers and if you want get sum press 0");
        int number = sc.nextInt();*/

       /* int sum = 0;
        int number;
        do {
            System.out.println("Please enter numbers and if you want get sum press 0");
            number = sc.nextInt();
            sum=sum + number;
        }while (number != 0);
        System.out.println("sum = "+(sum));*/

       // -------------- 4 -----------------

        /*Write a Java program to find positive and negative numbers of a given array:*/
           /* int[] numbers_array = { 10, -21 , 30, 31, -25};

            for (int i = 0; i < numbers_array.length; i++) {
                if (numbers_array[i] >= 1) {
                    System.out.println(numbers_array[i]+" is a positive number");
                }else if (numbers_array[i] <= -0) {
                    System.out.println(numbers_array[i]+" is a negative number");
                }
            }*/


        // ---------- 5 -------------
        /*
        * Write a Java program to find a shortest word of a given array:
- Original Array:
    [“Tuwaiq”, “Bootcamp” , “Student”,”JAVA”]
    - Expected Output:
     JAVA
*//*
        String[] course = {"Tuwaiq", "Bootcamp" , "Student","JAVA"};

        System.out.println("Enter number of course name: 0 = Tuwaiq | 1 = Bootcamp | 2 = Student | 3 = JAVA ");
        int shortest = sc.nextInt();
        System.out.println(course[shortest]);*/





    }
}