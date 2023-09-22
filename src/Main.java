/* I Vincent, have have neither given nor received unauthorized aid on this piece of work.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        String firstName;
        String favoriteFood;

        System.out.println("Enter your age:");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your first name:");
        firstName = scanner.nextLine();

        System.out.println("Enter your favorite food:");
        favoriteFood = scanner.nextLine();

        System.out.println("First name: " + firstName + "\nAge: " + age + "\nFavorite food: " + favoriteFood);
    }
}