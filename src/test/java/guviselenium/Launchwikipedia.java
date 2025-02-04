package guviselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchwikipedia {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement Search = driver.findElement(By.xpath("//input[@id='searchInput']"));

		Search.sendKeys("Artificial Intelligence");
		WebElement Submit = driver.findElement(By.xpath("//button[@type='submit']"));
		Submit.click();
		WebElement History = driver.findElement(By.xpath("//li[@id='toc-History']"));
		History.click();
		System.out.println(driver.getTitle());

		Thread.sleep(2000);
		//driver.close();

	}

}
