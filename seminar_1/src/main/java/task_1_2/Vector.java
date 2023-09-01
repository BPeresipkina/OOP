package task_1_2;

public class Vector {
    private int x, y, z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    /**
     * @return Длина вектора.
     * @apiNote Метод вычисляющий длину вектора.
     */
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * @param vector Вектор, с которым происходит перемножение.
     * @return Скалярное произведение.
     * @apiNote Метод, вычисляющий скалярное произведение.
     */
    public double scal(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    /**
     * @apiNote Метод, вычисляющий векторное произведение.
     * @param vector Вектор 2, с котором перемножается вестор 1.
     * @return Векторное произведение.
     */
    public Vector vecProduct(Vector vector) {
        return new Vector(
                (y* vector.z - z*vector.y),
                (z* vector.x-x*vector.z),
                (x*vector.y-y*vector.x));
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     * @apiNote Метод, вычисляющий косинус угла между двумя векторами.
     * @param vector Вектор 2, относительно которого происходит поиск косинуса угла между векторами.
     * @return Косинус угла между двумя векторами
     */
    public double cos(Vector vector) {
        double v = Math.abs(length()) * Math.abs(vector.length()); // TODO экстракт (Ctrl+Alt+v)
        return scal(vector)/ v;
    }
}
