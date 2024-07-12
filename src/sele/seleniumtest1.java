package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumtest1 {

	public static void main(String[] args) {
		//사용할 크롬드라이버 불러오기
		WebDriver driver = new ChromeDriver();
		
		//드라이버를 이용해서 페이지 열기
		driver.get("https://www.naver.com/");
		//#shortcutArea > ul > li:nth-child(6) > a
		//WebElement financeButton = driver.findElement(By.cssSelector("#shortcutArea > ul > li:nth-child(6) > a"));
		
		//클릭명령을 내림
		//financeButton.click();
		
		WebElement financeButton = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[6]/ul/li[6]/a"));
		
		financeButton. click();
		
	}

}
