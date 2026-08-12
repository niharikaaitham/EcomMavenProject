package testNGAssertions;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssertStudy {
//    @Test
    public void assertEqualsStudy(){
        String a="test";
        String b="Test";
        Assert.assertEquals(a,b,"a and b are not equal, TC Fail");
    }
//    @Test(enabled = false)
    public void assertNotEqualsStudy(){
        String oldSchool="Oxford";
        String newSchool="Benton";
        Assert.assertNotEquals(oldSchool,newSchool,"Both are equal, TC Failed");
    }
//    @Test
    public void assertTrue(){
       Boolean result=false;
       Assert.assertTrue(result, "Result is false, TC fail");
    }

//    @Test
    public void assertFalse(){
        Boolean result=true;
        Assert.assertFalse(result, "Result is true, TC fail");
    }
//    @Test
    public void assertNullStudy(){
        String a="test";
        Assert.assertNull(a, "a is not null, TC fail");
    }
//    @Test
    public void assertNotNullStudy(){
        String a=null;
        Assert.assertNotNull(a, "a is null, TC fail");
    }
//    @Test
    public void assertFailStudy(){
        Assert.fail();
    }
    @Test
    public void hardAssertDisadvantage() {
        //there should be text
        //text must be same
        String a = null;
        String b = "hello";

        Assert.assertNotNull(a, "text is null, TC fail");
        Assert.assertEquals(a, b, "text is not equal TC fail");
        Reporter.log("Happy Testing", true);

    }
}
