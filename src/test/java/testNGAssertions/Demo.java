package testNGAssertions;

import org.testng.annotations.Test;

public class Demo {
    @Test
    public void compareString(){
        String a="test";
        String b="test";
        if(a.equals(b)){
            System.out.println("TC Passed");
        }else {
            System.out.println("TC Fail");
        }
    }
}
