package homework.view;

// Принцип инверсии зависимостей. Реализация класса завязана на интерфейсе, а не на другом классе.

public class ArtistWorkView implements TakeArtWork,DoArtWork,GiveArtWork,AcceptArtWork {

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
