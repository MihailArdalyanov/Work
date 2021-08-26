package selenium3;

public class CrmTests {
    public static WebDriver driver;

    public static void loginToCrm(){
        driver.get("https://crm.geekbrains.space/user/login");
        driver.findElement(By.id("prependedInput")). sendKeys("Applanatest1");

    }


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get()


    }
}
