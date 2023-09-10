package task_2_1;

public class ClassFromTaskOneOOP {
    public static void main(String[] args) {
        Animal cat = new Cat("Bob", 3, "orange");
        System.out.println(cat);
        cat.animalInfo();
        cat.voice();
        cat.jump();
        ((Cat) cat).clew();


    }
}
