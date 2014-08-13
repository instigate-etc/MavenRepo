package ru.apache_maven;

import java.lang.Object;
import org.testng.annotations.*;
import org.testng.Assert;
/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
 @Test(groups={"unit"})
  public void testSad() throws Exception {
    assertEquals(1,1,"1<>1")
  }
}
