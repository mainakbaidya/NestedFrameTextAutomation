package nestedframetextautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCases {
    
    public void endTest(WebDriver driver)
    {
        System.out.println("End Test: TestCases");
       
        driver.quit();

    }

    
    public  void testCase01(WebDriver driver){
        
        try {

            System.out.println("Start Test case: testCase01");

            //Navigate to website
            driver.get("https://the-internet.herokuapp.com/nested_frames");

            //switch to top frame
            driver.switchTo().frame("frame-top");
            Thread.sleep(1000);

            //switch to left frame
            driver.switchTo().frame("frame-left");
            Thread.sleep(1000);

            //value inside left frame
            String valueOfLeftFrame = driver.findElement(By.xpath("//body")).getText();
           
            System.out.println("");
            
            //Print value 
            System.out.println("Value inside left frame is " + valueOfLeftFrame);
            System.out.println("");

            //switch to parent frame
            driver.switchTo().parentFrame();
            Thread.sleep(1000);

            //switch to middle frame
            driver.switchTo().frame("frame-middle");
            Thread.sleep(1000);

            //value inside middle frame
            String valueOfMiddleFrame = driver.findElement(By.xpath("//body")).getText();
           
            //Print value 
            System.out.println("Value inside middle frame is " + valueOfMiddleFrame);
            System.out.println("");

            //switch to parent frame
            driver.switchTo().parentFrame();
            Thread.sleep(1000);

            //switch to right frame
            driver.switchTo().frame("frame-right");
            Thread.sleep(1000);

            //value inside right frame
            String valueOfRightFrame = driver.findElement(By.xpath("//body")).getText();
           
            //Print value 
            System.out.println("Value inside right frame is " + valueOfRightFrame);
            System.out.println("");

            //switch to parent frame
            driver.switchTo().parentFrame();
            Thread.sleep(1000);

            //switch to default content
            driver.switchTo().defaultContent();
            Thread.sleep(1000);

            //switch to bottom frame
            driver.switchTo().frame("frame-bottom");
            Thread.sleep(1000);

            //value inside bottom frame
            String valueOfBottomFrame = driver.findElement(By.xpath("//body")).getText();
           
            //Print value 
            System.out.println("Value inside bottom frame is " + valueOfBottomFrame);
            System.out.println("");
            
            //switch to default content
            driver.switchTo().defaultContent();
            System.out.println("Reached at default content!!");
            
             System.out.println("end Test case: testCase01");

        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }

}
