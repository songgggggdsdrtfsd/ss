package sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumtest3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://finance.naver.com/");
		
		List<WebElement> newsTitleList = driver. findElements(By.xpath("/html/body/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div/ul/li"));
			
				
				for(WebElement webElement : newsTitleList) {
					System.out.println(webElement.getText());
				}

	}

}
