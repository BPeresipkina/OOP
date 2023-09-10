package task_3_2;

public enum Fruit {
    Apple("Яблоко"), Orange("Апельсин"), Peach("Персик"),
    Pineapple("Ананас"), Kiwi("Киви"), Pear("Груша");
    private String name;

    private Fruit(String name) {
        this.name = name;
    }

    Fruit() {
    }

    public String getName() {
        return name;
    }
}
