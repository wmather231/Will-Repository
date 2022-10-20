package Week2;

import helpers.InputReader;

public class Week02
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  Week 2 Java Selection & Iteration ");
        System.out.println();
        System.out.println(" by William Mather");
        System.out.println();

        String grade = InputReader.getString("Enter your grade: ");

        switch (grade) {
        case "A": System.out.println("This is a 1st"); break;
        case "B": System.out.println("This is a 2:1"); break;
        case "C": System.out.println("This is a 2:2"); break;
        case "D": System.out.println("This is a 3rd"); break;
        case "E": System.out.println("This is an ordinary"); break;
        case "F": System.out.println("This is a fail"); }

        for (int digits = 0; digits <= 9; digits++) {
            System.out.println(digits);
        }

        int multiplicand;
        int multiplier = InputReader.getInt("Enter the number you would like to see the times table of: ");
        for (multiplicand = 1; multiplicand <= 12; multiplicand++) {
            System.out.print(multiplicand + " x " + multiplier + " = ");
            System.out.println(multiplicand * multiplier);


        }

    }
}
