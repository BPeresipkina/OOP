package HomeWork_1;
//1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
//2)Создать класс Категория, имеющий переменные имя и массив товаров.
//  Создать несколько объектов класса Категория.
//3)Создать класс Basket, содержащий массив купленных товаров.
//4)Создать класс User, содержащий логин, пароль и объект класса Basket.
//  Создать несколько объектов класса User.
//5)Вывести на консоль каталог продуктов. (все продукты магазина)
//6)Вывести на консоль покупки посетителей магазина.
// (После покупки у пользователя добавляется товар, а из магазина - удаляется)

public class Category {
    protected String nameCategory;
    protected String[] arrayProduct;


    public Category(String nameCategory, String[] arrayProduct) {
        this.nameCategory = nameCategory;
        this.arrayProduct = arrayProduct;
    }

    public Category() {
    }
}