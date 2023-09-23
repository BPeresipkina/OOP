package task_5_1.service;

import task_5_1.model.Letter;

public interface LetterInterface {
    public String sendLetter(Letter data);
    public void acceptLetter();
    public void returnLetter();
}
