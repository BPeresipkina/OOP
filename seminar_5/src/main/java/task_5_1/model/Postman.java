package task_5_1.model;

import javax.xml.namespace.QName;

public class Postman extends User{
    private String occupation;

    public Postman(String name) {
        super(name);
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Postman(String name, String occupation) {
        super(name);
        this.occupation = occupation;
    }
}
