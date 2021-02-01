import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Tag;

public class BigClassTestStefan {

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
    @DisplayName("Kolla om setters funkar.")

    void checkSetFunction() {
        BigClass testObject = new BigClass(10);
        int expected = 10;      // Test code
        testObject.setNumber(-10);  //CUT
        int actual = testObject.getNumber();
        Assertions.assertEquals(expected, actual); // Assertions
    }

    @Test
    @DisplayName("Kolla även om getters funkar.")
    void checkGetFunction() {
        BigClass testObject = new BigClass("Stefan");
        String expected = "Stefan";
        String actual = testObject.getText();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkSumOfNumbers() {
        BigClass testObject = new BigClass(0);
        int expected = 20;
        int actual = testObject.addNumbers(10,10);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Method that turns letters to UpperCase.")
    @Tag("UnderDevelopment...")
    void checkUpperCase() {
        BigClass testObject = new BigClass("Stefan"); //Test code
        String expected = "STEFAN"; //Test code
        testObject.turnLettersToUpper(); //CUT
        Assertions.assertEquals(expected, testObject.getText()); //Assertions
    }

    @Test
    @DisplayName("Method that turns letters to NULL")
    @Tag("UnderConstruction...")
    void checkTextNull() {
        BigClass testObject = new BigClass("null");
        String expected = null;
        testObject.turnTextToNull();
        String actual = testObject.getText();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Method that checks method toString")
    void checkToString() {
        BigClass testObject = new BigClass();
        String actual = testObject.toString();
        System.out.println(actual);
    }
}
