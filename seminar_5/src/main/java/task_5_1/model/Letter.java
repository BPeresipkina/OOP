package task_5_1.model;

public class Letter {
    private Human to;
    private Postman doing;

    public Letter(Human to, Postman doing, String data) {
        this.to = to;
        this.doing = doing;
        this.data = data;
    }

    private String data;

    @Override
    public String toString() {
        return "Letter{" +
                "to=" + to +
                ", doing=" + doing +
                ", data='" + data + '\'' +
                '}';
    }

    public Letter() {
    }

    public Letter NewLetter(){
        return new Letter
                (new Human("Ivan"),
                        new Postman("Leo"),
                        "Почтальон принес письмо");

    }
}
