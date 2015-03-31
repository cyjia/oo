public class Length {
    private int value;
    private final Unit unit;

    public Length(int value) {
        this(value, Unit.CM);
    }

    public Length(int value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        return ((Length)obj).value == this.value;
    }
}
