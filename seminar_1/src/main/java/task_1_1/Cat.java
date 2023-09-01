package task_1_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Cat extends Animal {
    //1) Создать класс Cat с полями: имя,цвет,кол-во лет. Поработать с полями напрямую
    //2) Данному классу добавить инкапсуляцию + сделать валидацию на введенный возраст
    private int age;
    private String color;

    public Cat(String name, int age, String color) {
        super(name);
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Количество лет дб положительным");
        } else {
            this.age = age;
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void animalInfo() {
        System.out.println("Кот " + super.name + ", цвет: " + color + ", возраст: " + age);
    }
}
