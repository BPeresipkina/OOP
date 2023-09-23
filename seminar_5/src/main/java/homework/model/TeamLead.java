package homework.model;

public class TeamLead extends User{
    private int experience;

    public TeamLead(String name) {
        super(name);
    }

    public TeamLead(String name, int stage) {
        super(name);
        this.experience = stage;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

}
