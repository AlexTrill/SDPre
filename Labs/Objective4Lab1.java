import java.util.Scanner;

public class Objective4Lab1 {
    public static void main(String[] args) {

     Scanner keyboard = new Scanner(System.in);

     String Fname = "";
     String lname = "";
     String favoriteAnimal = "";
     String favoriteFood = "";
     String favoriteSong = "";

     System.out.println("What is your first name?");
     Fname = keyboard.nextLine();
     System.out.println("What is your last name?");
     lname = keyboard.nextLine();
     System.out.println("What is your favorite animal?");
     favoriteAnimal = keyboard.nextLine();
     System.out.println("What is your favorite food?");
     favoriteFood = keyboard.nextLine();
     System.out.println("What is your favorite song?");
     favoriteSong = keyboard.nextLine();

     System.out.println(" My name is " + Fname + lname);
     System.out.println(" My favorite animal is " + favoriteAnimal);
     System.out.println(" My favorite food is " + favoriteFood);
     System.out.println(" My favorite song is " + favoriteSong);
    }
}
