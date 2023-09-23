package task_5_1.MVP;

import task_5_1.model.Letter;

public interface View {
    public void SendLetter();
    public void AcceptLetter(String data);
    public void ReturnLetter();
    public void TalkWithPostman();
}
