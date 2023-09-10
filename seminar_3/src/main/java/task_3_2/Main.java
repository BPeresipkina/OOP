package task_3_2;

public class Main {
    public static void main(String[] args) {
        Fruit fruit1 = Fruit.Apple;
        switch (fruit1){
            case Pear -> System.out.println("pear " + fruit1.getName());
            case Pineapple -> System.out.println("pineapple " + fruit1.getName());
            case Kiwi -> System.out.println("kiwi " + fruit1.getName());
            case Apple -> System.out.println("apple " + fruit1.getName());
            case Peach -> System.out.println("peach " + fruit1.getName());
            case Orange -> System.out.println("orange " + fruit1.getName());
            default -> System.out.println("Такого фрукта в списке нет!");
        }
    }
}
