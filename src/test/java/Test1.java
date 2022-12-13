import org.junit.jupiter.api.*;

public class Test1 {
    // this class will be showing the - Annotations //
    @BeforeAll
    static void beforeAll(){
        System.out.println("Executed Once, Before All the TEST METHOD");
    }

    @BeforeEach
     void beforeEach(){
        System.out.println("Executed Before Each Test Method in this class");
    }

    @Test
    void testMethod1(){
        System.out.println("Test METHOD");
    }

    @DisplayName("Test Method 2 with Condition")
    @Test
    void testmethod2(){
        System.out.println("Test METHOD 2 ");
    }

    @Test
    @Disabled("Implementation Pending")
    void testmethod3(){
        System.out.println("TEST METHOD 3");
    }
    @AfterEach
    void AfterEach(){
        System.out.println("Excuted, After Each Test Method");
    }

   @AfterAll
    static void AfterAll(){
        System.out.println("Executed After All the TEST METHOD");
    }

}
