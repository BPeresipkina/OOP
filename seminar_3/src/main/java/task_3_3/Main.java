package task_3_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Game game;
        System.out.println("В какую игру вы хотите сыграть? \nN - числовая, R - русские буквы, E - фнглийские буквы");
        Scanner scanner = new Scanner(System.in);
        String scannerGame = scanner.nextLine();

        if(scannerGame.equals("E")){
            game = new GameEng();
        } else if(scannerGame.equals("R")){
            game = new GameRus();
        } else if(scannerGame.equals("N")){
            game = new GameNumber();
        } else {
            System.out.println("Введено неверное значение, игра будет продолжена как числовая!");
            game = new GameNumber();
        }
        System.out.println("Введите кол-во символов: ");
        String scannerSizeWord = scanner.nextLine();
        int sizeWord = parseInt(scannerSizeWord);

        System.out.println("Введите кол-во попыток: ");
        String scannerMaxTry = scanner.nextLine();
        int maxTry = parseInt(scannerMaxTry);

        game.start(sizeWord, maxTry);
        List<Answer> listA = new ArrayList<>();
        while (game.getGameStatus().equals(GameStatus.START)){
            System.out.println("Введите свой вариант: ");
            String scannerWord = scanner.nextLine();
            Answer answer = game.inputValue(scannerWord);
            System.out.println(answer);
            listA.add(answer);
        }
        if (game.getGameStatus().equals(GameStatus.WIN)){
            System.out.println("Вы победили!");
        } else {
            System.out.println("Вы проиграли!");
        }
        System.out.println("Хотите посмотреть историю игры? \n Y - да, N - нет");
        String scannerHistory = scanner.nextLine();

        if (scannerHistory.equals("Y")){
            System.out.println(listA);
        }
    }
}
