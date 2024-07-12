package sele;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumedussafy {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://edu.ssafy.com/comm/login/SecurityLoginForm.do");
		WebElement ID = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div/div[2]/div[1]/div[1]/input"));
		ID.sendKeys("dl7071@naver.com");
		WebElement PASSWORD = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div/div[2]/div[1]/div[2]/input"));
		PASSWORD.sendKeys("pinegem7071!");
		
		PASSWORD.sendKeys(Keys.ENTER);
		
		Thread.sleep(500);
		
		WebElement button = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/button[2]"));
		button.click();
		
		Thread.sleep(500);
		
		WebElement comu = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div[2]/ul/li[3]/a"));
		comu.click();
	
		Thread.sleep(500);
		
		WebElement ik = driver.findElement(By.xpath("/html/body/div[1]/form/div/div[1]/div[2]/div/ul/li[3]/a"));
		ik.click();
		
		//글쓰기
//		WebElement gl = driver.findElement(By.xpath("/html/body/div[1]/form/div/div[2]/div/div[2]/div/span/button"));
//		gl.click();
//		
//		
//		WebElement jm = driver.findElement(By.xpath("/html/body/div[1]/form/div/div[2]/div/div[1]/div/div[1]/div[2]/input"));
//		jm.sendKeys("test");
//		
//		
//		WebElement intext = driver.findElement(By.xpath("/html/body/div[1]/form/div/div[2]/div/div[1]/div/div[2]/div[2]/div/textarea"));
//		intext.sendKeys("test입니다");
//		
//		WebElement summit = driver.findElement(By.xpath("/html/body/div[1]/form/div/div[2]/div/div[2]/div[2]/div/a"));
//		summit.click();
//		
//		Thread.sleep(500);
//		
//		WebElement summitf = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/button"));
//		summitf.click();
//		
		
//		//좋아요
//		List<WebElement> annList = driver.findElements(By.xpath("/html/body/div[1]/form/div/div[2]/div/div[3]/ul/li"));
//        
//		
//        for (int i = 1; i <= annList.size(); i++) {
//          
//            WebElement element = driver.findElement(By.xpath("html/body/div[1]/form/div/div[2]/div/div[3]/ul/li[" + i + "]/div[1]/a"));
//           
//            element.click();
//            
//            // 페이지 접속 후 좋아요 버튼 누르고 목록으로 복귀
//            WebElement annGood = driver.findElement(By.xpath("/html/body/div[1]/form/div/div[2]/div/div[2]/div[4]/div/button[1]"));
//            if (annGood.getText().equals("수정")) {
//                WebElement annBackList = driver.findElement(By.xpath("/html/body/div[1]/form/div/div[2]/div/div[3]/div[2]/div/div/button"));
//                annBackList.click();
//                Thread.sleep(300);
//                
//                continue;
//    			
//    		}
//            annGood.click();
//            Thread.sleep(500);
//            
//            WebElement annBackList = driver.findElement(By.xpath("/html/body/div[1]/form/div/div[2]/div/div[3]/div[2]/div/div/button"));
//            annBackList.click();
//            Thread.sleep(300);
//            
//            
//            Set<String> handles = driver.getWindowHandles();
//            for (String handle : handles) {
//                driver.switchTo().window(handle);
//            }
//
//            annList.get(i);
//        }
//        
//        
//        System.out.println(annList.size());
        // 클릭후 새로운 탭이 생겼으므로 마지막 핸들로 전환

		
        //멘토링게시판
        WebElement mentoring = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div[2]/ul/li[5]/a"));
        mentoring.click();
        
        //주요트렌드
        WebElement trend = driver.findElement(By.xpath("/html/body/div[1]/form/div/div[2]/div/div[2]/div/div/ul/li[4]/a"));
        trend.click();
        
        List<WebElement> trendList = driver.findElements(By.xpath("/html/body/div[1]/form/div/div[2]/div/div[3]/ul/li"));
        
        for (int i = 3; i <= trendList.size(); i++) {
            
           WebElement element2 = driver.findElement(By.xpath("/html/body/div[1]/form/div/div[2]/div/div[3]/ul/li[" + i + "]/div[2]/a"));
           System.out.println(element2.getText());
        
        
        }
        
		
		
	}

}
