package task_5_1.MVP;

import task_5_1.model.Letter;

public class HumanLetterView implements View {

    @Override
    public void SendLetter() {
        System.out.println("Отдать письмо почтальону");
    }

    @Override
    public void AcceptLetter(String data) {
        System.out.println("Принять письмо у почтальона");
    }

    @Override
    public void ReturnLetter() {
        System.out.println("Вернуть письмо почтальону");
    }

    @Override
    public void TalkWithPostman() {
        System.out.println("Поговорить с почтальоном");
    }
}
