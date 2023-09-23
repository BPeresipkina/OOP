package homework.model;

public class Artist extends User{
    private String status;

    public Artist(String name, String status) {
        super(name);
        this.status = status;
    }

    public Artist(String name) {
        super(name);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
