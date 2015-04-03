public class LengthUnit {
    public static LengthUnit CM = new LengthUnit(10);
    public static LengthUnit M = new LengthUnit(1000);
    public static LengthUnit MM = new LengthUnit(1);

    private final int ratio;

    LengthUnit(int ratio) {
        this.ratio = ratio;
    }

    public int transFrom(LengthUnit unit, int value) {
        return unit.ratio * value / ratio;
    }
}
