package info.tng.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestFirst {

    @BeforeClass
    public void beforeClass() {
        System.out.println("This method will be executed before class, Name - " + this.getClass().getName()
                + " Thread ID-  " + Thread.currentThread().threadId());
    }

    @AfterClass
    public void afterClass() {
        System.out.println("This method will be executed after class, Name - " + this.getClass().getName()
                + " Thread ID-  " + Thread.currentThread().threadId());
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This method will be executed before method, Name - " + this.getClass().getName()
                + " Thread ID-  " + Thread.currentThread().threadId());
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This method will be executed after method, Name - " + this.getClass().getName()
                + " Thread ID-  " + Thread.currentThread().threadId());
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("This method will be executed before test, Name - " + this.getClass().getName()
                + " Thread ID-  " + Thread.currentThread().threadId());
    }

    @AfterTest
    public void afterTest() {
        System.out.println("This method will be executed After test, Name - " + this.getClass().getName()
                + " Thread ID-  " + Thread.currentThread().threadId());
    }

    @Test(groups = "sanity")
    public void test1() {
        System.out.println("****** This is test1 belongs to class TestFirst");
        Assert.assertEquals("Something Else",
                "Hello");
    }

    @Test(groups = {"sanity"})
    public void test2() {
        System.out.println("****** This is test2 belongs to class TestFirst");
    }

    @Test(groups = {"smoke"}, dependsOnGroups = {"sanity"})
    public void test3() {
        System.out.println("****** This is test3 belongs to class TestFirst");
    }

    @Test(groups = {"sanity"})
    public void test4() {
        System.out.println("****** This is test4 belongs to class TestFirst");
    }

    @Test
    public void test5() {
        System.out.println("****** This is test5 belongs to class TestFirst");
    }
}





