package registerSucessfully;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class register {

	private WebDriver driver;
	
	JavascriptExecutor js;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		///registerSucessfully/drivers/chromedriver/chromedriver.exe
		js = (JavascriptExecutor) driver;
	
	}

	@After
	public void tearDown() {
		System.out.println("Parabéns! O Organizze já está preparado para você! Enviamos um e-mail para sua caixa de entrada. Confirme seu cadastro para receber um e-mail importante da nossa equipe.");
		//driver.quit();
	}

	@Test
	public void untitled() {
		driver.get("https://www.organizze.com.br/");
		driver.manage().window().setSize(new Dimension(1058, 812));
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.linkText("Faça o cadastro!")).click();
		js.executeScript("window.scrollTo(0,0)");
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("coelho.baden@444ttt.com");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("testaut2020");
		driver.findElement(By.id("repeatPassword")).sendKeys("testaut2020");
		driver.findElement(By.id("termsOfUse")).click();
		driver.findElement(By.cssSelector(".styled__StyledButtonWithButton-sc-1s4v64k-1")).click();
		driver.findElement(By.cssSelector("html")).click();
	}
}
