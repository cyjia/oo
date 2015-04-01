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
        assertEquals(new Length(1, LengthUnit.CM), new Length(1, LengthUnit.CM));
    }

    @Test
    public void should_be_equal_given_two_length_of_1_M_and_1_M() throws Exception {
        assertEquals(new Length(1, LengthUnit.M), new Length(1, LengthUnit.M));
    }

    @Test
    public void should_be_equal_given_two_length_of_1_MM_and_1_MM() throws Exception {
        assertEquals(new Length(1, LengthUnit.MM), new Length(1, LengthUnit.MM));
    }

    @Test
    public void should_be_equal_given_two_length_of_1_M_and_100_CM() throws Exception {
        assertEquals(new Length(1, LengthUnit.M), new Length(100, LengthUnit.CM));
    }

    @Test
    public void should_be_equal_given_two_length_of_1_M_and_1000_MM() throws Exception {
        assertEquals(new Length(1, LengthUnit.M), new Length(1000, LengthUnit.MM));
    }

    @Test
    public void should_be_equal_given_two_length_of_1_CM_and_10_MM() throws Exception {
        assertEquals(new Length(1, LengthUnit.CM), new Length(10, LengthUnit.MM));
    }

    @Test
    public void should_not_be_equal_given_two_length_of_1_CM_and_2_CM() throws Exception {
        assertNotEquals(new Length(1, LengthUnit.CM), new Length(2, LengthUnit.CM));
    }

    @Test
    public void should_not_be_equal_given_two_length_of_1_CM_and_1_MM() throws Exception {
        assertNotEquals(new Length(1, LengthUnit.CM), new Length(1, LengthUnit.MM));
    }
}