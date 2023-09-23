package task_5_1.model;

public class Human extends User{
    private String addres;

    public Human(String name) {
        super(name);
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public Human(String name, String addres) {
        super(name);
        this.addres = addres;
    }

}
