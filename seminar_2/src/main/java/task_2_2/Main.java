package task_2_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> baseAnimal = new ArrayList<>();
        baseAnimal.add(new Dog("Шарик"));
        baseAnimal.add(new HomeCat("Снежок"));
        baseAnimal.add(new Tiger("Шерхан"));

        for (int i = 0; i < baseAnimal.size(); i++) {
            var h = baseAnimal.get(i);
            h.Run(300);
            h.Swim(20);
        }
        System.out.println(Animal.count);
        System.out.println(Cat.countCat);
        System.out.println(Dog.countDog);
        System.out.println(HomeCat.countHomeCat);
        System.out.println(Tiger.countTiger);
    }
}
