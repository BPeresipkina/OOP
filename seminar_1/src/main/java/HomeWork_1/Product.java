package HomeWork_1;

import java.util.Random;

//1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
//2)Создать класс Категория, имеющий переменные имя и массив товаров.
//  Создать несколько объектов класса Категория.
//3)Создать класс Basket, содержащий массив купленных товаров.
//4)Создать класс User, содержащий логин, пароль и объект класса Basket.
//  Создать несколько объектов класса User.
//5)Вывести на консоль каталог продуктов. (все продукты магазина)
//6)Вывести на консоль покупки посетителей магазина.
// (После покупки у пользователя добавляется товар, а из магазина - удаляется)
public class Product extends Category {
    private String name;
    private double cost;
    private double rating;
    Random randCost = new Random();
    Random randRating = new Random();


    public Product(String[] arrayProduct) {
        for (int i = 0; i < arrayProduct.length; i++) {
            this.name = arrayProduct[i];
            this.cost = randCost.nextDouble(100, 200);
            this.rating = randRating.nextDouble(1, 5);
//            System.out.println(this.name);
//            System.out.println(this.cost);
//            System.out.println(this.rating);
        }
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", rating=" + rating +
                '}';
    }
}
