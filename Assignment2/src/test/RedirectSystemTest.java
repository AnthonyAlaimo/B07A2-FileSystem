package test;
//**********************************************************
//Assignment2:
//Student1: Muizz Uddin Ahmed
//UTORID user_name: ahmed323
//UT Student #: 1004160043
//Author:
//
//Student2: Nicholas Michael Gibson Elliott
//UTORID user_name: ellio232
//UT Student #: 1004416713
//Author:
//
//Student3: Anthony Alaimo
//UTORID user_name: alaimoa1
//UT Student #: 1004421814
//Author:
//
//Student4: Millan Singh Khurana
//UTORID user_name: khuran53
//UT Student #: 1004169259
//Author:
//
//
//Honor Code: I pledge that this program represents my own
//program code and that I have coded on my own. I received
//help from no one in designing and debugging my program.
//I have also read the plagiarism section in the course info
//sheet of CSC B07 and understand the consequences.
//*********************************************************


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;
import mockJShell.MockRedirectSystem;

public class RedirectSystemTest {

  @Before
  public void setUp() throws Exception {}

  @After
  public void tearDown() throws Exception {}

  @Test
  public void testRedirectSeparator() {
    String input = "TEXT > OTHERTEXT";
    String[] output = MockRedirectSystem.redirectionSeperator(input);
    Assert.assertEquals("TEXT ", output[0]);
    Assert.assertEquals("> OTHERTEXT", output[1]);
  }
  
  @Test
  public void testRedirectSeparatorWithAppend() {
    String input = "TEXT >> OTHERTEXT";
    String[] output = MockRedirectSystem.redirectionSeperator(input);
    Assert.assertEquals("TEXT ", output[0]);
    Assert.assertEquals(">> OTHERTEXT", output[1]);
  }
  
  @Test
  public void testRedirectSeparatorNoSeperator() {
    String input = "TEXT OTHERTEXT";
    String[] output = MockRedirectSystem.redirectionSeperator(input);
    Assert.assertEquals("TEXT OTHERTEXT", output[0]);
    Assert.assertEquals("", output[1]);
  }
  
  @Test
  public void testRedirectSeparatorInvalidSeperator() {
    String input = "TEXT >>> OTHERTEXT";
    String[] output = MockRedirectSystem.redirectionSeperator(input);
    Assert.assertNull(output);
  }

}
