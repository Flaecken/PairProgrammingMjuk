import org.junit.jupiter.api.*;

public class JobExample {

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

    /* Chilli uppgift lol
    @ParameterizedTest
    @DisplayName("Check method sum")
    @ValueSource(ints = {0,100})

    }
    */

}
