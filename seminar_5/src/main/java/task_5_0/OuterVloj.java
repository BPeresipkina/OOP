package task_5_0;

public class OuterVloj {

    public OuterVloj() {
    }

    class InnerVloj {
        int innerVlojValue;

        public InnerVloj(int innerValue) {
            this.innerVlojValue = innerValue;
        }

        public void innerVlojValuesMethod(){
            System.out.println(innerVlojValue);
            System.out.println(outerVlojValue);
            innerVlojValuesMethod();
            outerVlojValueMethod();
        }
    }
    int outerVlojValue;

    public OuterVloj(int outerValue) {
        this.outerVlojValue = outerValue;
    }

    public void outerVlojValueMethod(){
        System.out.println(outerVlojValue);
//        System.out.println(innerValue);
        outerVlojValueMethod();
//        innerValueMethod();
    }

    public static void main(String[] args) {
        InnerVloj inner = new OuterVloj().new InnerVloj(10);

    }
}