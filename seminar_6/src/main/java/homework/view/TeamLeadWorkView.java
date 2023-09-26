package homework.view;

public class TeamLeadWorkView implements TakeArtWork,DoArtWork,GiveArtWork,AcceptArtWork {

    @Override
    public void TakeArtWork() {
        System.out.println("TeamLead took the artwork");
    }

    @Override
    public void DoArtWork() {
        System.out.println("TeamLead does the artwork");
    }

    @Override
    public void GiveArtWork() {
        System.out.println("TeamLead gave the artwork");
    }

    @Override
    public void AcceptArtWork() {
        System.out.println("TeamLead accepted the artwork");
    }
}
