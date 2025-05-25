package parrot;

public abstract class Parrot {
    protected final int numberOfCoconuts;
    protected final double voltage;
    protected final boolean isNailed;

    protected static final double BASE_SPEED = 12.0;
    protected static final double LOAD_FACTOR = 9.0;

    public Parrot(int numberOfCoconuts, double voltage, boolean isNailed) {
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public abstract double getSpeed();

    public abstract String getCry();
}
