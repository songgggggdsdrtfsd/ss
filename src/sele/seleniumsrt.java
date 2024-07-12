package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class seleniumsrt {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://etk.srail.kr/main.do");
		
		Select depature = new Select(driver.findElement(By.name("dptRsStnCd")));
		depature.selectByVisibleText("동탄");
		
		Select arrival = new Select(driver.findElement(By.name("arvRsStnCd")));
		
		arrival.selectByValue("0010");
		
		
	}

}
