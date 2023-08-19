package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("""
        1 - Greet
        2 - Even
        3 - Calc
        4 - GCD
        5 - Progression
        6 - Prime
        0 - Exit""");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String userChoiceStr = scanner.next();
        switch (userChoiceStr) {
            case "0" -> {
                return;
            }
            case "1" -> Cli.greet();
            case "2" -> Engine.play(new Even());
            case "3" -> Engine.play(new Calc());
            case "4" -> Engine.play(new Gcd());
            case "5" -> Engine.play(new Progression());
            case "6" -> Engine.play(new Prime());
            default -> System.out.println("Invalid input string format!");
        }
    }
}
