package parrot.factories;

import parrot.*;

public class ParrotFactory {
    public Parrot build(ParrotTypeEnum parrotType, int numberOfCoconuts, double voltage, boolean isNailed) {
        return switch (parrotType) {
            case EUROPEAN -> new EuropeanParrot(numberOfCoconuts, voltage, isNailed);
            case AFRICAN -> new AfricanParrot(numberOfCoconuts, voltage, isNailed);
            case NORWEGIAN_BLUE -> new NorwegianBlueParrot(numberOfCoconuts, voltage, isNailed);
            default -> throw new IllegalArgumentException("Unsupported parrot type: " + parrotType);
        };
    }
}
