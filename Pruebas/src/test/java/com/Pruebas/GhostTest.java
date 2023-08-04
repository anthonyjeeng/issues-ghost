package com.Pruebas;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GhostTest {
private WebDriver driver;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:2368/ghost/#/signin");
	}
	
	@After
	public void tearDown() throws Exception {
		if(driver!=null) {
			driver.quit();
		}
	}
	
	@Test
	public void test() throws InterruptedException {
					
		// -> Iniciar Sesión
		
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("/html/body/div[2]/div/main/div[1]/div/section/form/header/div")).isDisplayed()){
			driver.findElement(By.id("identification")).sendKeys("pieroalex64@gmail.com");
			driver.findElement(By.id("password")).sendKeys("7894561230");
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/main/div[1]/div/section/form/button/span")).click();
		}
		Thread.sleep(1000);
		
		// -> Recorrido
		
		driver.findElement(By.xpath("//*[@id=\"ember32\"]/div/div/div[2]/div/div")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ember18")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ember19")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ember20")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ember26")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ember27")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ember28")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ember29")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ember30")).click();
		Thread.sleep(1000);
		
		// -> Menbers
		
		driver.findElement(By.xpath("/html/body/div[2]/div/nav[1]/div/section/div[1]/ul[2]/li[4]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/main/section/div/header/section/div[2]/a")).click();
		Thread.sleep(2000);
		
				//Cambiar Datos
		driver.findElement(By.id("member-name")).sendKeys("fdsffdsfdfds521g5846gf3");
		driver.findElement(By.id("member-email")).sendKeys("alfdfdfsdfsdj35v25jhgcxds@gmail.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/main/section/div[2]/form/div/section/div/div[1]/div/div[2]/div/div[1]/ul/input")).sendKeys("fnjfhljdksamdiewhdnkljcxbkabhdjadñdeaodjfjdkfkklfjfjafjlaf");
		driver.findElement(By.id("member-note")).sendKeys("Mario el mejor");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/main/section/div[2]/form/div/section/div/div[2]/div[1]/div/div[2]/label/span")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/main/section/div[2]/form/div/section/div/div[2]/div[1]/div/div[2]/label/span")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/main/section/div[1]/header/section/button/span")).click();
		Thread.sleep(2000);
		
		// -> Tags
		
		driver.findElement(By.id("ember30")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/main/section/div/header/section/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("tag-name")).sendKeys("fdsffdsfdfsfsdsgrgs45623");
		driver.findElement(By.xpath("/html/body/div[2]/div/main/section/form/div[2]/section/div/div[1]/div[1]/div[2]/div/input")).sendKeys("5c1010");
		driver.findElement(By.id("tag-slug")).sendKeys("fdsffdsfdsfdsfsdsgrfdfdsfsdfgvgthgjfg25586////////djaudjuadgs45623");
		driver.findElement(By.xpath("/html/body/div[2]/div/main/section/form/section/div[1]/div[1]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("meta-title")).sendKeys("fdsffdsfdsdsfsdsgrgs45623");
		driver.findElement(By.id("meta-description")).sendKeys("2525342645623");
		driver.findElement(By.id("canonical-url")).sendKeys("https://mario.nintendo.com/es/");
		driver.findElement(By.xpath("/html/body/div[2]/div/main/section/form/div[1]/header/section/button")).click();
		
		// -> Eliminar Members
		
		driver.findElement(By.xpath("/html/body/div[2]/div/nav[1]/div/section/div[1]/ul[2]/li[4]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//tr[@data-test-list='members-list-item'])[2]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/main/section/div[1]/header/section/span/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/main/section/div[1]/header/section/span/ul/li[2]/button")).click();
		//   //button[@data-test-button="delete-member"]
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/button[2]")).click();
		Thread.sleep(1000);
		
		// -> Post

		driver.findElement(By.id("ember20")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/main/section/div/header/section/div[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/main/div[1]/section/div[1]/div[1]/textarea")).sendKeys("HOLA MUNDO 123456789");
		driver.findElement(By.xpath("/html/body/div[2]/div/main/div[1]/section/div[1]/div[1]/article/div[1]/div")).sendKeys("Hola (Hola)\r\n"
				+ "No sé si te acuerdas de mí (De mí)\r\n"
				+ "Hace tiempo no te veo por ahí (Por ahí)\r\n"
				+ "Soy yo (Soy yo)\r\n"
				+ "El que siempre le hablaba de ti (-ba de ti)\r\n"
				+ "A tu mejor amiga pa' que me tire la buena (Buena)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/main/div[1]/section/header/section/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/header/div[2]/div/button[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/header/div[2]/div/button[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/header/div[2]/div/button[4]")).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/header/div/button[2]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/div[1]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/div[3]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/div[3]/div/div/div/fieldset/div[1]/div[2]")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[3]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[2]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/p/button")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/main/div[1]/section/header/div/a")).click();
		
		// -> Configuracion
		
		driver.findElement(By.xpath("/html/body/div[2]/div/nav[1]/div/section/div[2]/div/div/div[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/main/section/div/header/section/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[5]/div/div/button")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/main/section/section/div[6]/a[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/main/section/div/header/div/div/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/main/section/section/div[2]/a[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/nav[1]/div/header/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/nav[1]/div/section/div[2]/div/div/div[1]/div[1]")).click();
		Thread.sleep(2000);
		
		// -> Cambiar contraseña
		
		driver.findElement(By.xpath("/html/body/div[1]/div/ul/li[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("user-password-old")).sendKeys("7894561230");
		driver.findElement(By.id("user-password-new")).sendKeys("7894561230");
		driver.findElement(By.id("user-new-password-verification")).sendKeys("7894561230");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/main/section/section/div/form[2]/div/fieldset/div[4]/button")).click();
		
		// -> Salir
		
		driver.findElement(By.xpath("/html/body/div[2]/div/nav[1]/div/section/div[2]/div/div/div[1]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/ul/li[9]")).click();
		Thread.sleep(2000);		
		
		
		
		
		
	}
}
