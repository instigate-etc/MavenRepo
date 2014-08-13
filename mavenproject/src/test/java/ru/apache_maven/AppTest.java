package ru.apache_maven;

import java.lang.Object;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.testng.annotations.*;
import org.testng.Assert;
/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{



    private String var = System.getProperty("variable");
    private String name="Good";

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        System.out.println("Hi, Happy day");
        Assert.assertEquals(name,"Good","Fill file");
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

  @Test
  public void testSeriousness() throws Exception {
    assert SeriousComponent.testSeriousness("SAD");
    assert SeriousComponent.testSeriousness("SERIOUS");
    assert SeriousComponent.testSeriousness("CRAZY");
    assert !SeriousComponent.testSeriousness("FUNNY");
  }
}
