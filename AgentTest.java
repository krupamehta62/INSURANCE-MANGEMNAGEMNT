package Insurance;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class AgentTest {

    @Test
    public void phonetest() {
        String iphoneno = "";
        Agent instance = new Agent();
        boolean expResult = true;
        boolean result = instance.phonetest(iphoneno);
        assertEquals(expResult, result);
    }

    @Test
    public void TestPhone(){
        System.out.println("Add test case run");
        boolean exp_res = true, result;
        Agent instance = new Agent();
        instance.iphoneno.setText("1234567890");
        result = instance.checkphone();
        assertEquals(exp_res, result);
    }

    @Test
    @DisplayName("Test case  for nametest boolean method username empty")
    public void testNametest() {
        System.out.println("nametest");
        String username ="";
        Agent instance = new Agent();
        boolean expResult =true;
        boolean result= instance.testNametest(username);
        assertEquals(expResult, result);
    }
    @Test
    @DisplayName("Test case  for nametest boolean method username not empty")
    public void testNametestNotEmpty() {
        String username ="abc";
        Agent instance = new Agent();
        boolean expResult =false;
        boolean result= instance.testNametest(username);
        System.out.println(result);
        assertEquals(expResult, result);
    }
}