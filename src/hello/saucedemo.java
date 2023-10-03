package hello;
	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class saucedemo {
	    
	    public static void main(String[] args) {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\testpractice\\Drivers\\chromedriver.exe");
	        		
	        
	        // Create a new instance of the ChromeDriver
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        // Navigate to www.saucedemo.com
	        driver.get("https://www.saucedemo.com");

	        // Verify the title of the page
	        String expectedTitle = "Swag Labs";
	        String actualTitle = driver.getTitle();
	        if (actualTitle.equals(expectedTitle)) {
	            System.out.println("Title is correct: " + actualTitle);
	        } else {
	           System.out.println("Title is incorrect. Expected: " + expectedTitle );
	        }
	        

	        // Login with standard_user and secret_sauce
	        WebElement usernameField = driver.findElement(By.id("user-name"));
	        WebElement passwordField = driver.findElement(By.id("password"));
	        WebElement loginButton = driver.findElement(By.id("login-button"));

	        usernameField.sendKeys("standard_user");
	        passwordField.sendKeys("secret_sauce");
	        loginButton.click();

	        // Access the menu on the left of the page and click logout
	        WebElement menuButton = driver.findElement(By.id("react-burger-menu-btn"));
	        menuButton.click();

	       WebElement logout = driver.findElement(By.id("logout_sidebar_link"));
	       logout.click();

	        // Close the browser
	        driver.quit();
	    }

}








