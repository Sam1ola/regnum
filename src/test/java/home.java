import Resource.base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.net.URL;

public class home extends base {
//WebDriver driver;
    @Test
    public void test () throws IOException {

        driver=initializeDriver();
        driver.get("https://covercheck.vwfsinsuranceportal.co.uk/" );
        driver.findElement( By.id("vehicleReg") ).sendKeys( "ov12uyy" );
        driver.findElement( By.name( "btnfind" ) ).click();
        driver.findElement( By.className( "result" ) ).isDisplayed();


    }


}
