package text_transformer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTransformerTest {


    public static final String UPPER_CASE = "ADRIAN";
    public static final String LOWER_CASE = "adrian";
    TestTransformer testTransformer;

    @BeforeEach
    void setUp() {
        testTransformer = new TestTransformer();
    }

    @Test
    @DisplayName("Should Return Capitalized String")
    void capitalize() {
        //when
        String returnString = testTransformer.capitalize(LOWER_CASE);

        //then
        assertEquals(returnString, UPPER_CASE);
    }

    @Test
    @DisplayName("Should Return Lowered Case String")
    void toLowerCase() {
        //when
        String returnString = testTransformer.toLowerCase(UPPER_CASE);

        //then
        assertEquals(returnString, LOWER_CASE);
    }
}