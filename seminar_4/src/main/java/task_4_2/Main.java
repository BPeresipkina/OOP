package task_4_2;

public class Main {
    public static void main(String[] args) {
        StudentService studServ = new StudentService();
        studServ.create("St1", 1, 8,20);
        studServ.create("St2", 2, 6,22);
        studServ.create("St3", 3, 9,21);
        studServ.create("St4", 4, 4,22);
        System.out.println(studServ.getAll());
    }
}
