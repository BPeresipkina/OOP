package task_5_1.service;

import task_5_1.model.Letter;

public class LetterService implements LetterInterface{


    @Override
    public String sendLetter(Letter data) {
        return "Письмо " + data + " отправлено";
    }

    @Override
    public void acceptLetter() {
        System.out.println("Принято");
    }

    @Override
    public void returnLetter() {
        System.out.println("Возвращено");
    }
}
