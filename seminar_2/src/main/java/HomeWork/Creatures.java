package HomeWork;

public abstract class Creatures {
    String name;

    public Creatures(String name) {
        this.name = name;
    }

    public Creatures() {
    }


    protected abstract int Run(int max);
    protected abstract int Jump(int max);

}
