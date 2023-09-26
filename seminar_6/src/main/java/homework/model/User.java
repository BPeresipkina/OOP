package homework.model;

// Принцип закрытости-открытости. Класс закрыт для изменений и открыт для расширений.

public abstract class User {
    private String name;

    public User(String name) {
        this.name = name;
    }
}
