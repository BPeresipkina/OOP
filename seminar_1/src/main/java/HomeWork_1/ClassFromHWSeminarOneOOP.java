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

public class ClassFromHWSeminarOneOOP {
    public static void main(String[] args) {

        Category category1 = new Category("Молочные продукты",
                new String[]{"сыр", "молоко", "творог", "сметана"});
        Category category2 = new Category("Мясо",
                new String[]{"говядина", "свинина", "баранина"});
        Category category3 = new Category("Рыба",
                new String[]{"семга", "форель", "лосось"});
        Category category4 = new Category("Овощи",
                new String[]{"огурцы", "помидоры", "перцы", "картофель", "морковь"});
        Product product = new Product(category1.arrayProduct);
        Basket basket1 = new Basket(new String[]{"сыр", "лосось", "помидоры"});
        Basket basket2 = new Basket(new String[]{"молоко", "картофель"});
        Basket basket3 = new Basket(new String[]{"огурцы", "форель", "сметана"});
        User user1 = new User("1", "1234", basket1);
        User user2 = new User("2", "12345", basket2);
        User user3 = new User("3", "123456", basket3);
        System.out.println(product);
    }
}
