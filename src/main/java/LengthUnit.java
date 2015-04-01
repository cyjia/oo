public enum LengthUnit {
    CM(10),
    M(1000),
    MM(1);

    private final int ratio;

    LengthUnit(int ratio) {
        this.ratio = ratio;
    }

    public int toBaseUnit(int value) {
        return value * ratio;
    }

}
