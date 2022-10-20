package Week1;

import helpers.InputReader;
public class Week1 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  Week 1 Java Basic Input/Output ");
        System.out.println();
        System.out.println(" by William Mather");
        System.out.println();

        String name = InputReader.getString("Enter your name > ");
        System.out.println("Hello " + name);


        System.out.println("insert the Length and Height of your shape!");
        int length = InputReader.getInt("Length:");
        int height = InputReader.getInt("height:");
        int perimeter = (2 * height) + (2 * length);
        int area = height + length;
        System.out.println("the perimeter is: " + perimeter + " The Area is: " + area);

        System.out.println("Enter two values and then we will find the average!");
        double numberOne = InputReader.getDouble("Enter the first number: ");
        double numberTwo = InputReader.getDouble("Enter the second Number: ");
        double average = (numberOne + numberTwo) / 2;
        System.out.println("The average is " + average);


        int orderedNumberOne = InputReader.getInt("Enter the first Value: ");
        int orderedNumberTwo = InputReader.getInt("Enter the second value: ");
        System.out.println("Your numbers were: " + orderedNumberOne + " " + orderedNumberTwo);
        System.out.println("Your numbers were also: " + orderedNumberTwo + " " + orderedNumberOne);

        System.out.println("Enter your age!");
        int age = InputReader.getInt("Age: ");
        System.out.println("You were born in the year: " + (2022 - age));



    } 
}
