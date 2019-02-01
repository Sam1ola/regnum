package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {


    WebDriver driver;
    public Homepage(WebDriver driver) {
        // TODO Auto-generated constructor stub
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }



    @FindBy(id="vehicleReg")
    WebElement Searchbox;

    @FindBy(name="btnfind")
    WebElement Findvehicle;

    @FindBy(className="result")
    WebElement VehicleResult;






    public WebElement Searchbox()
    {
        return Searchbox;
    }

    public WebElement Findvehicle()
    {
        return Findvehicle;
    }


    public WebElement VehicleResult()
    {
        return VehicleResult;
    }


}
