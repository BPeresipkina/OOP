package task_6_1;

public class ElectronBook extends Book{
    private int weight;
    private FormatElectronBook format;

    public ElectronBook(String name, String address, BookGenre bookGenre, int weight, FormatElectronBook format) {
        super(name, address, bookGenre);
        this.weight = weight;
        this.format = format;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public FormatElectronBook getFormat() {
        return format;
    }

    public void setFormat(FormatElectronBook format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "ElectronBook{" +
                "weight=" + weight +
                ", format=" + format +
                '}';
    }
}
