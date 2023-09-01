package task_1_2;

import task_1_1.Animal;

public class OOPSeminarOneVector {
    public static void main(String[] args) {
        Vector vec1 = new Vector(1, 0, 1);
        Vector vec2 = new Vector(2, 1, 2);
        System.out.println("vec1.length() = " + vec1.length());
        System.out.println(vec1.scal(vec2));
        System.out.println(vec1.vecProduct(vec2));
        System.out.println(vec1.cos(vec2));

    }
}
