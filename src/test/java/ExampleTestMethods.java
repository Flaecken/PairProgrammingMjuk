import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Duration;

public class ExampleTestMethods {

    @BeforeAll
    static void setup(){
        System.out.println("Starting testsuite - (Before All)");
    }

    @BeforeEach
    void setupEach(TestInfo testInfo){
        System.out.println("Test starts - " + testInfo.getDisplayName());
    }

    @AfterAll
    static void tearDown(){
        System.out.println("Closin testsuite - (After All)");
        }

    @AfterEach
    void tearDownEach(TestInfo testInfo){
        System.out.println("Test closes - " + testInfo.getDisplayName());
    }

    @Test
    void testMax(){
        int a = 10;
        int b = 15;
        int expected = 15;
        int actual = Math.max(a,b);
        Assertions.assertEquals(expected,actual); //Assertions
    }

    @Test
    void testMin(){
        int a = 7;
        int b = 6;
        int expected = 6;
        int actual = Math.min(a,b);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void testIsEmpty(){
        String testTrue = "";
        String testFalse = "tja";
        boolean actual = testTrue.isEmpty();
        Assertions.assertTrue(actual);
        actual = testFalse.isEmpty();
        Assertions.assertFalse(actual);
    }


    @Test
    void testContains(){
    String testInput = "Vincent";
    boolean actual = testInput.contains("Vin");
    Assertions.assertTrue(actual);
    actual = testInput.contains("Jeff");
    Assertions.assertFalse(actual);
    }

    @Test
    @DisplayName("Testing method string.length()")
    void testStringLength(){
        String stringExample = "Stefan";
        Assertions.assertEquals(stringExample.length(), 6);

    }

    @ParameterizedTest
    @DisplayName("Tests method negative")
    @CsvSource({
                "-5,5",
                "-10,10",
                "-20,20",
                "-100,100",
                "-1000,1000",
    })
    void testNegative(int expected, int input) {
        MyClass testObject = new MyClass();
        int actual = testObject.negative(input);
        Assertions.assertEquals(expected, actual);      // Assertions
    }

    @ParameterizedTest
    @DisplayName("Method to check .length")
    @ValueSource(strings = {"a","ab", "abc", "abcd", "abcde"}) //Testcode
    void testStringLengthParameterized(String input){
        int actual = input.length();  // CUT
        Assertions.assertTrue(actual > 0); //Assertions
    }

    @ParameterizedTest
    @DisplayName("Method for checking UpperCase")
    @CsvSource({
                "JEFF, jeff",
                "STEFAN, stefan",
                "YAY, yay",
                "WOW, wow",
                "EUREKA, eureka",
    })
    void testUpper(String expected, String input){
        String actual = input.toUpperCase();
        Assertions.assertEquals(expected, actual);
    }

    @RepeatedTest(15)
    @DisplayName("Testar hur lång tid metoden tar att utföra.")
    void testTimeoutInc() {
        MyClass testObject = new MyClass();     // test code
        Assertions.assertTimeout(Duration.ofMillis(200), () -> testObject.inc(10)); // assertions
    }

    @RepeatedTest(10)
    @DisplayName("Testar en annan metod hur lång tid den tar att utföra.")
    void testDiceEffectiveness() {
        MyClass testObject = new MyClass();     // test code
        Assertions.assertTimeout(Duration.ofMillis(10), () -> testObject.generateRandom(125)); // assertions
    }

}
