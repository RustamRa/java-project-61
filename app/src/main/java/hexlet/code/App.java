package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int choiceMin = 1;
        int choiceMax = 6;
        String choiceExit = "0";
        //int choiceExit = 0;

        //int userChoice = choiceApp();
        Scanner scanner = new Scanner(System.in);

        // Выбор действия пользователя
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        String userChoiceStr = scanner.next();

//        int userChoice = 0;
//
//        try {
//            userChoice = Integer.parseInt(userChoiceStr);
//        } catch (NumberFormatException e) {
//            System.err.println("Неправильный формат строки!");
//        }

        // Если пользователь выбрал "выйтм", то выход
        if (userChoiceStr.equalsIgnoreCase(choiceExit)) {
            return;
        }
//        if (choiceExit == userChoice) {
//            return;
//        }

        // Если пользователь выбрал несуществующий номер,
        // то сообщаем об этом и выходим
//        if (userChoice < choiceMin || userChoice > choiceMax) {
//            System.out.println("You have selected an invalid number!");
//            return;
//        }
        // Приветствуем пользователя и уточняем его имя
        System.out.println("Welcome to the Brain Games!");
        String userName = Cli.greetings();
        // Делаем дальнейший выбор
        switch (userChoiceStr) {
//        switch (userChoice) {
            case "2" -> Engine.engine(new Even(), userName);
            case "3" -> Engine.engine(new Calc(), userName);
            case "4" -> Engine.engine(new Gcd(), userName);
            case "5" -> Engine.engine(new Progression(), userName);
            case "6" -> Engine.engine(new Prime(), userName);
            default -> {
            }
        }
    }
}
