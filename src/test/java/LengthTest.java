import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LengthTest {

    @Test
    public void should_be_equal_given_same_value() throws Exception {
        assertEquals(new Length(10), new Length(10));
    }

    @Test
    public void should_not_be_equal_given_different_value() throws Exception {
        assertNotEquals(new Length(1), new Length(2));
    }

    @Test
    public void should_be_equal_given_two_length_with_same_unit_and_same_value() throws Exception {
        assertEquals(new Length(1, Unit.CM), new Length(1, Unit.CM));
    }
}