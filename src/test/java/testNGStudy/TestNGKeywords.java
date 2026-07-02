package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGKeywords {
//    @Test(invocationCount=2)
//    public void a(){
//        Reporter.log("test method a",true);
//    }
//@Test(priority=-5)
//    public void a1(){
//    Reporter.log("login",true);
//}
//    @Test(priority=3)
//    public void a2(){
//        Reporter.log("logout",true);
//    }
//    @Test(timeOut=200)
//    public void b() throws InterruptedException {
//        Thread.sleep(40);
//        Reporter.log("payment is processing",true);

//    }
//        @Test(enabled=false)
//    public void c() {
//            Reporter.log("disabled method", true);
//        }
        @Test(dependsOnMethods = {"d"})
    public void c() {
            Reporter.log("c is running", true);
        }

        @Test(dependsOnMethods={"e"})
    public void d(){
            Reporter.log("d is running",true);
        }

    @Test
    public void e(){
        Reporter.log("e is running",true);
    }
}
