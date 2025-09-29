package Basic_Java;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Fruit name  ");
        String fruit = sc.next().toLowerCase();

        switch (fruit)
        {
            case "mango":
                System.out.println("King of fruits");
                break;

            case "pineapple":
                System.out.println("moslty uses for juice");
                break;

            case "apple":
                System.out.println("Most healthier fruit");
                break;

            default:
                System.out.println("your fruit name not match");
        }

        System.out.println("Enter a no for know day");
        int day = sc.nextInt();
        switch (day)
        {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("you enter Enter Wrong day no");
        }
    }
}
