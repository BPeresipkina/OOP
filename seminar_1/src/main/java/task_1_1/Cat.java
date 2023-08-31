package task_1_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cat {
    //1) Создать класс Cat с полями: имя,цвет,кол-во лет. Поработать с полями напрямую
    //2) Данному классу добавить инкапсуляцию + сделать валидацию на введенный возраст
    private String name;
    private int age;
    private String color;
//
//    public Cat(String name, int age, String color) {
//        this.name = name;
//        this.age = age;
//        this.color = color;
//    }
//
//    @Override
//    public String toString() {
//        return "Cat{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", color='" + color + '\'' +
//                '}';
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//    public void setAge(int age) {
//        if (age < 0){
//            throw new IllegalArgumentException("Количество лет дб положительным");
//        } else {
//            this.age = age;
//        }
//    }
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public String getName() {
//        return name;
//    }
//    public int getAge() {
//        return age;
//    }
//    public String getColor() {
//        return color;
//    }

}
