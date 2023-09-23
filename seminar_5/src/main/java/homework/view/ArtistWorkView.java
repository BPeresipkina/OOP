package homework.view;

public class ArtistWorkView implements View {

    @Override
    public void TakeArtWork() {
        System.out.println("Artist took the artwork");
    }

    @Override
    public void DoArtWork() {
        System.out.println("Artist does the artwork");
    }

    @Override
    public void GiveArtWork() {
        System.out.println("Artist gave the artwork");
    }

    @Override
    public void AcceptArtWork() {

    }
}
