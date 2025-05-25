package parrot.factories;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import parrot.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParrotFactoryTest {
    private ParrotFactory factory;

    @BeforeEach
    public void setUp() {
        factory = new ParrotFactory();
    }

    @Test
    public void whenTypeIsEuropean_returnsEuropeanParrot() {
        Parrot parrot = factory.build(ParrotTypeEnum.EUROPEAN, 0, 0, false);
        assertEquals(EuropeanParrot.class, parrot.getClass());
    }

    @Test
    public void whenTypeIsAfrican_returnsAfricanParrot() {
        Parrot parrot = factory.build(ParrotTypeEnum.AFRICAN, 0, 0, false);
        assertEquals(AfricanParrot.class, parrot.getClass());
    }

    @Test
    public void whenTypeIsNorwegian_returnsNorwegianParrot() {
        Parrot parrot = factory.build(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 0, false);
        assertEquals(NorwegianBlueParrot.class, parrot.getClass());
    }
}
