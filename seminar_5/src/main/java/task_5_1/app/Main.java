package task_5_1.app;

import task_5_1.MVP.HumanLetterView;
import task_5_1.controler.Controler;
import task_5_1.model.Letter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controler controler = new Controler();
        Letter letter = new Letter().NewLetter();
        controler.start(letter);


    }
}
