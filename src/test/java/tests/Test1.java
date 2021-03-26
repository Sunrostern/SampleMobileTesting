package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
    @BeforeMethod
    public void setUp() {
        System.out.println("Setting up Test1.");
    }

    @Test
    public void testing_01() {
        System.out.println("Running Test1 on Thread ID " + Thread.currentThread().getId() + ".");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Tearing down Test1.");
    }
}
