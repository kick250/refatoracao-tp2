package parrot;

public class EuropeanParrot extends Parrot {
    public EuropeanParrot(int numberOfCoconuts, double voltage, boolean isNailed) {
        super(numberOfCoconuts, voltage, isNailed);
    }

    public double getSpeed() {
        return BASE_SPEED;
    }

    public String getCry() {
        return "Sqoork!";
    }
}
