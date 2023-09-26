package homework.app;

import homework.controler.Controler;

public class Main {
    public static void main(String[] args) {
        Controler controler = new Controler();
//        Scanner scanner = new Scanner(System.in);
        //TODO заполнение данных
        controler.go();
        controler.showBoard();
    }
}
