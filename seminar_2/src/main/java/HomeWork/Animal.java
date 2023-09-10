package HomeWork;

public abstract class Animal extends Creatures{
    String name;

    public Animal(String name) {
        this.name = name;
    }


    @Override
    protected abstract int Run(int max);

    @Override
    protected abstract int Jump(int max);
}
