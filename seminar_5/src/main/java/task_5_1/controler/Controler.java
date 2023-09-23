package task_5_1.controler;

import task_5_1.MVP.HumanLetterView;
import task_5_1.model.Letter;
import task_5_1.service.LetterService;

public class Controler {
    LetterService letterService = new LetterService();
    HumanLetterView humanLetterView = new HumanLetterView();

    public void start(Letter data) {
        String qwe = letterService.sendLetter(data);
        humanLetterView.AcceptLetter(qwe);
    }

}
