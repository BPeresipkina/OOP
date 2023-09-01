package task_1_1;

public class ClassFromOOPSeminarOneTaskOne {
    public static void main(String[] args) {
        Cat cat = new Cat("Пушок", 21, "Белый");
//        cat.setAge(-10);
        System.out.println(cat);
        Animal animal = new Animal();
        animal.animalInfo();
        animal.voice();
        animal.jump();
        cat.animalInfo();
    }
}
