package task_5_0;

public class OuterVnut {

    public OuterVnut() {
    }

    static class InnerVnut {
        int innerVnutValue;

        public InnerVnut(int innerValue) {
            this.innerVnutValue = innerValue;
        }

        public void innerVnutValuesMethod(){
            System.out.println(innerVnutValue);
//            System.out.println(outerVnutValue);
//            innerVnutValuesMethod();
//            outerVnutValueMethod();
        }
    }
    int outerVnutValue;

    public OuterVnut(int outerValue) {
        this.outerVnutValue = outerValue;
    }

    public void outerVnutValueMethod(){
        System.out.println(outerVnutValue);
//        System.out.println(innerValue);
//        outerVnutValueMethod();
//        innerValueMethod();
    }

    public static void main(String[] args) {
        InnerVnut inner = new InnerVnut(10);
        class Cell{
            int x;

            @Override
            public String toString() {
                return "Cell{" +
                        "x=" + x +
                        '}';
            }

            public Cell(int x) {
                this.x = x;
            }
        }
        Cell cell = new Cell(3);
        Flyable flyable = new Flyable() {
            @Override
            public void fly() {
                System.out.println("FLYFLYFLY");
            }
        };
//        flyable.fly();
        System.out.println(flyable.getClass().getName());
//        String s = "stepbystep";
//        System.out.println(s.getClass().getName());
        // Outer implements Fluable -
        // Outer$1 flyable = new Outer();
    }
}