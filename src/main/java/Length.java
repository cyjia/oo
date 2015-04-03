public class Length {
    private int value;
    private final LengthUnit unit;

    public Length(int value) {
        this(value, LengthUnit.CM);
    }

    public Length(int value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        Length other = (Length) obj;
        return this.value == unit.transFrom(other.unit, other.value);
    }
}
