package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test4 {
    @BeforeMethod
    public void setUp() {
        System.out.println("Setting up Test4.");
    }

    @Test
    public void testing_01() {
        System.out.println("Running Test4 on Thread ID " + Thread.currentThread().getId() + ".");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Tearing down Test4.");
    }
}
