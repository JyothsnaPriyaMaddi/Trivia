import java.util.Scanner;

public class Trivia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int points = 0;

        System.out.println("***Welcome to Trivia Quiz***");
        System.out.println("1. Which country held the 2016 Summer Olympics?\na) China\nb) Ireland\nc) Brazil\nd) Italy");
        char answer1 = sc.next().charAt(0);
        
        if(answer1 == 'c') {
            points += 5;
        } else {
            points = 0;
        }
        System.out.println("2. Which planet is the hottest?\na) Venus\nb) Saturn \nc) Mercury\nd) Mars");
        char answer2 = sc.next().charAt(0);
        if(answer2 == 'a') {
            points += 5;
        } else {
            points -= 5;
        }
        System.out.println("3. What is the rarest blood type?\na) O\nb) A\nc) B\nd) AB-Negative");
        char answer3 = sc.next().charAt(0);

        if(answer3 == 'd') {
            points += 5;
        } else {
            points -= 5;
        }
        System.out.println("4. Which one of these characters is friends with Harry Potter?\na) Ron Weasley\nb) Hermione Granger\nc) Draco Malfoy");
        char answer4 = sc.next().charAt(0);

        if(answer4 == 'a' || answer4 == 'b') {
            points += 5;
        } else {
            points -= 5;
        }

        if(points >= 15) {
            System.out.println("Wow, you know your stuff!");
        } else if(points < 15 && points >= 5) {
            System.out.println("Not bad!");
        } else {
            System.out.println("Better luck next time.");
        }

        
    }
}