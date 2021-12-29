//import static  org.junit.Assert.*;
//import org.junit.Test;

import Insurance.Login;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class TestName {
    private boolean expResult;

    @Test
    @DisplayName("Test case  for nametest boolean method username empty")
    public void testNametest() {
        System.out.println("nametest");
        String username ="";
        Login instance = new Login();
        boolean expResult =true;
        boolean result= instance.testNametest(username);
        assertEquals(expResult, result);
    }
    @Test
    @DisplayName("Test case  for nametest boolean method username not empty")
    public void testNametestNotEmpty() {
        String username ="abc";
        Login instance = new Login();
        boolean expResult =false;
        boolean result= instance.testNametest(username);
        System.out.println(result);
        assertEquals(expResult, result);
    }
    @Test
    @DisplayName("Test case  for password boolean method username not empty")
    public void TestpasswordEmpty() {
        String password="";
        Login instance = new Login();
        boolean expResult =true;
        boolean result= instance.TestpasswordCheck(password);
        assertEquals(expResult, result);
    }
    @Test
    public void Testpassword() {
        String password="abc";
        Login instance = new Login();
        boolean expResult =false;
        boolean result= instance.TestpasswordCheck(password);
        assertEquals(expResult, result);
    }
    @Test
    public void validatePassword_Missing_OneSymbol() {
        // setup
        String password = "Abcdefg5";
        Login instance = new Login();
        // execute
        boolean actual = instance.validatePassword(password);
        boolean expResult =true;

        // assert
        assertEquals(expResult,actual);
        System.out.println("testcase run succesfully");
    }
    @Test
    public void validatePassword_Missing_OneLowerCaseLetter() {
        // setup
        Login instance = new Login();
        String password = "ABCDEFG5#";

        // execute
        boolean actual = instance.validatePassword(password);

        // assert
        assertEquals(expResult,actual);
        System.out.println("testcase run succesfully");
    }
}

